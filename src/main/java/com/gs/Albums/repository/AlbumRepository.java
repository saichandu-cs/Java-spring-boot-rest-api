package com.gs.Albums.repository;

import com.gs.Albums.models.Albums;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AlbumRepository extends JpaRepository<Albums,Long> {

    @Query(value = "select * from albums a where a.user_id=1",nativeQuery = true)
    Page<Albums> findAlbumUserId1(Pageable pageable);

    Albums findByTitleAndUserId(String title,Long UserId);

}
