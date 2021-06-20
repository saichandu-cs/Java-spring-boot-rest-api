package com.gs.Albums.services;

import com.gs.Albums.exceptions.ResouceNotFoundException;
import com.gs.Albums.models.Photos;
import com.gs.Albums.repository.AlbumRepository;
import com.gs.Albums.repository.PhotosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Service
public class PhotoService {
        @Autowired
        private PhotosRepository photosRepository;

        @Autowired
        private AlbumRepository albumRepository;

        public Page<Photos> getAllPhotos(Pageable pageable)
        {
            return photosRepository.findAll(pageable);
        }

        public Page<Photos> getPhotosByAlbumId(@PathVariable(value = "albumId") Long albumId)
        {
            return photosRepository.findByAlbumId(albumId,Pageable.unpaged());
        }

        public Optional getPhotosByAlbumId(@PathVariable (value = "albumId") Long albumId, @PathVariable (value = "photoId") Long photoId)
        {
            return photosRepository.findByIdAndAlbumId(photoId,albumId);
        }

        public Photos AddPhoto(@PathVariable (value = "albumId") Long albumId, @RequestBody Photos photos)
        {
            return albumRepository.findById(albumId).map(album -> {
                photos.setAlbums(album);
                photos.setAlbumId(albumId);
                return photosRepository.save(photos);
            }).orElseThrow(()-> new ResouceNotFoundException("No Album exists with the Id:"+albumId));

//        Albums albums=albumRepository.getById(albumId);
//        photos.setAlbums(albums);
//        photos.setAlbumId(albumId);
//
//        return photosRepository.save(photos);

        }

        public Photos EditPhoto(@PathVariable (value = "albumId") Long albumId,@PathVariable (value = "photoId") Long photoId,@Validated @RequestBody Photos photos)
        {
            return photosRepository.findById(photoId).map(photos1 -> {
                photos1.setTitle(photos.getTitle());
                photos1.setThumbnail(photos.getThumbnail());
                photos1.setUrl(photos.getUrl());
                return photosRepository.save(photos1);
            }).orElseThrow(()-> new RuntimeException("no photo exists with that id"));
        }

        public ResponseEntity<?> DeletePhoto(@PathVariable (value = "albumId") Long albumId, @PathVariable (value = "photoId") Long photoId)
        {
            return photosRepository.findByIdAndAlbumId(albumId, photoId).map(photos1 -> {
                photosRepository.delete(photos1);
                return ResponseEntity.ok().build();
            }).orElseThrow(()-> new RuntimeException("no photo exists with that id"));
        }
//should come deleted successfully

        public Optional getAlbumByPhotoId(@PathVariable (value = "id") Long id)
        {
            return photosRepository.findById(id).map(photos -> {
                return albumRepository.findById(photos.getAlbumId());
            }).orElseThrow(()->new ResouceNotFoundException("photo not found with the given ID."));
        }

}

