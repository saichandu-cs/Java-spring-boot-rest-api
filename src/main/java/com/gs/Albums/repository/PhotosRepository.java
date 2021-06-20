package com.gs.Albums.repository;

import com.gs.Albums.models.Albums;
import com.gs.Albums.models.Photos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.management.OperatingSystemMXBean;
import java.util.Optional;
@Repository
public interface PhotosRepository extends JpaRepository<Photos,Long> {


    Page<Photos> findByAlbumId(Long id, Pageable pageable);
    Optional<Photos> findByIdAndAlbumId(Long id,Long albumsId);
}
