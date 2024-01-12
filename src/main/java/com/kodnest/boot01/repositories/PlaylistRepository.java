package com.kodnest.boot01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.boot01.entities.Playlist;

public interface PlaylistRepository extends JpaRepository<Playlist, Integer>{

}
