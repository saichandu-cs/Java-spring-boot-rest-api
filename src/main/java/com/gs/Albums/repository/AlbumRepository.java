package com.gs.Albums.repository;

import com.gs.Albums.models.Albums;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Albums,Long> {
}
