package com.kodnest.boot01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.boot01.entities.Song;

public interface SongRepository extends JpaRepository<Song, Integer> {

	public Song findByName(String name);

}
