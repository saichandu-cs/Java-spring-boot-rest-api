package com.gs.Albums.controllers;

import com.gs.Albums.models.Photos;
import com.gs.Albums.services.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;
@RestController
public class PhotosController {
    @Autowired
    private PhotoService photoService;

    @GetMapping("/photos")
    public Page<Photos> getAllPhoto(Pageable pageable) { return photoService.getAllPhotos(pageable); }

    @GetMapping("/albums/{albumId}/photos")
    public Page<Photos> getPhotosByAlbumIds(@PathVariable (value = "albumId") Long albumId) { return photoService.getPhotosByAlbumId(albumId); }

    @GetMapping("/albums/{albumId}/photos/{photoId}")
    public Optional getPhotosByAlbumIds(@PathVariable (value = "albumId") Long albumId, @PathVariable (value = "photoId") Long photoId) { return photoService.getPhotosByAlbumId(photoId,albumId); }

    @PostMapping("/albums/{albumId}/photos")
    public Photos AddPhotos(@PathVariable (value = "albumId") Long albumId, @RequestBody Photos photos) { return photoService.AddPhoto(albumId,photos); }

    @PutMapping("/albums/{albumId}/photos/{photoId}")
    public Photos EditPhotos(@PathVariable (value = "albumId") Long albumId,@PathVariable (value = "photoId") Long photoId,@Validated @RequestBody Photos photos) { return photoService.EditPhoto(albumId,photoId,photos); }

    @DeleteMapping("/albums/{albumId}/photos/{photoId}")
    public ResponseEntity<?> DeletesPhoto(@PathVariable (value = "albumId") Long albumId, @PathVariable (value = "photoId") Long photoId) { return photoService.DeletePhoto(albumId,photoId); }

    @GetMapping("/photos/{id}")
    public Optional getAlbumByPhotoIds(@PathVariable (value = "id") Long id) { return photoService.getAlbumByPhotoId(id); }


}