package com.kodnest.boot01.entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//To Auto-generate the ID values
	int id;
	String name;
	String artist;
	String genre;
	String link;
	@ManyToMany
	List<Playlist> Playlists;
	public Song() {
		super();
	}
	public Song(int id, String name, String artist, String genre, String link, List<Playlist> playlists) {
		super();
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.genre = genre;
		this.link = link;
		Playlists = playlists;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public List<Playlist> getPlaylists() {
		return Playlists;
	}
	public void setPlaylists(List<Playlist> playlists) {
		Playlists = playlists;
	}
	@Override
	public String toString() {
		return "Song [id=" + id + ", name=" + name + ", artist=" + artist + ", genre=" + genre + ", link=" + link + "]";
	}
}
