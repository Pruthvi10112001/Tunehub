package com.kodnest.boot01.services;

import java.util.List;

import com.kodnest.boot01.entities.Playlist;

public interface PlaylistService {

	public void addPlaylist(Playlist playlist);

	public List<Playlist> fetchAllPlaylists();

}
