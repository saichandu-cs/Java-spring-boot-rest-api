package com.gs.Albums.services;

import com.gs.Albums.exceptions.ResouceNotFoundException;
import com.gs.Albums.models.Albums;
import com.gs.Albums.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
public class AlbumService {

    @Autowired
    private  AlbumRepository albumRepository;

        public Page<Albums> getAllAlbums(Pageable pageable)
        {
            return albumRepository.findAll(pageable);
        }

        public Albums addAlbum(@RequestBody Albums albums)
        {
            return albumRepository.save(albums);
        }

        public Albums editAlbum(@PathVariable(value = "albumId") Long albumId,@RequestBody Albums body)
        {
            return albumRepository.findById(albumId).map(album -> {
                album.setTitle(body.getTitle());
                album.setUserId((body.getUserId()));
                return albumRepository.save(album);
            }).orElseThrow(()->new RuntimeException("Album not found with Id"+albumId));
        }

        public ResponseEntity<?> DeleteAlbum(@PathVariable(value = "albumId") Long albumId)
        {
            return albumRepository.findById(albumId).map(album -> {
                albumRepository.delete(album);
                return ResponseEntity.ok().build();
            }).orElseThrow(()->new ResouceNotFoundException("Album not found with Id: "+ albumId));
        }



//    @PutMapping("/albums/{albumId}")
//    public Albums editAlbum(@PathVariable(value = "albumId") Long albumId,@RequestBody Albums body)
//    {
//        Albums albums= albumRepository.getById(albumId);
//
//        albums.setUserId(body.getUserId());
//        albums.setTitle(body.getTitle());
//
//        return albumRepository.save(albums);
//    }
//
//    @DeleteMapping("/albums/{albumId}")
//    public void DeleteAlbum(@PathVariable(value = "albumId") Long albumId)
//    {
//        Albums albums=albumRepository.getById(albumId);
//
//        albumRepository.delete(albums);
//    }
}
