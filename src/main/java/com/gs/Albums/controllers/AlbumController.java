package com.gs.Albums.controllers;

import com.gs.Albums.models.Albums;
import com.gs.Albums.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlbumController {
    @Autowired
    private AlbumService albumService;

    @GetMapping("/albums")
    public Page<Albums> getAlbums(Pageable pageable) { return albumService.getAllAlbums(pageable); }

    @PostMapping("/albums")
    public Albums addAlbums(@RequestBody Albums albums) { return albumService.addAlbum(albums); }

    @PutMapping("/albums/{albumId}")
    public Albums editAlbums(@PathVariable(value = "albumId") Long albumId,@RequestBody Albums body) { return albumService.editAlbum(albumId,body); }

    @DeleteMapping("/albums/{albumId}")
    public ResponseEntity<?> DeleteAlbum(@PathVariable(value = "albumId") Long albumId) { return albumService.DeleteAlbum(albumId); }
}
