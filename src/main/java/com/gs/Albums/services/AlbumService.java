package com.gs.Albums.services;

import com.gs.Albums.exceptions.ResouceNotFoundException;
import com.gs.Albums.models.Albums;
import com.gs.Albums.repository.AlbumRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class AlbumService {


    private  final  AlbumRepository albumRepository;
    @Autowired
    public AlbumService(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public Page<Albums> getAllAlbums(Pageable pageable) {
            log.info("In getAllAlbums method");
            return albumRepository.findAlbumUserId1(pageable);
        }

        public Albums addAlbum(Albums albums)
        {
            log.info("In AddAlbum Method");
            return albumRepository.save(albums);
        }

        public Albums editAlbum(Long albumId, Albums body)
        {
            log.info("In editAlbum method");
            Optional<Albums> albumRepositoryById = albumRepository.findById(albumId);

            if (!albumRepositoryById.isPresent())
            {

                    log.error("Album not found with Id"+albumId);
                    throw new ResouceNotFoundException("Album not found with Id"+albumId);
            }
            Albums album1=albumRepositoryById.get();
            album1.setTitle(body.getTitle());
            album1.setUserId((body.getUserId()));

            log.error("return from editAlbum Method");
            return albumRepository.save(album1);

//            return albumRepository.findById(albumId).map(album -> {
//                album.setTitle(body.getTitle());
//                album.setUserId((body.getUserId()));
//                return albumRepository.save(album);
//            }).orElseThrow(()->new RuntimeException("Album not found with Id"+albumId));
        }

        public ResponseEntity<?> DeleteAlbum(Long albumId)
        {
            log.info("in DeleteAlbum Method");
            return albumRepository.findById(albumId).map(album -> {
                albumRepository.delete(album);
                return ResponseEntity.ok().build();
            }).orElseThrow(()->new ResouceNotFoundException("Album not found with Id: "+ albumId));
        }


    public Albums getbytitleanduserid(Long userid,String title)
    {
        return  albumRepository.findByTitleAndUserId(title,userid);
    }


        public void saves(List<Albums> albums)
        {
//            for(Albums a:albums) {
//                albumRepository.save(a);
//            }
            albumRepository.saveAll(albums);
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
