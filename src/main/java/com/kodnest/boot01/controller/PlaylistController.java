package com.kodnest.boot01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodnest.boot01.entities.Playlist;
import com.kodnest.boot01.entities.Song;
import com.kodnest.boot01.services.PlaylistService;
import com.kodnest.boot01.services.SongService;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class PlaylistController {
	@Autowired
	SongService songService;
	
	@Autowired
	PlaylistService playlistService;
	
	@GetMapping("/createPlaylist")
	public String createPlaylist(Model model) {
		//fetch song list
		List<Song> songList=songService.fetchAllSongs();
		//add to model obj
		model.addAttribute("songs",songList);
		return "createPlaylist";
	}
	@PostMapping("/addPlaylist")
	public String addPlaylist(@ModelAttribute Playlist playlist) {
		//updating playlist table
		playlistService.addPlaylist(playlist);
		//updating song table
		List<Song> songList=playlist.getSongs();
		for(Song s:songList) {
			s.getPlaylists().add(playlist);
			//Update song object in database
			songService.updateSong(s);
		}
		return "adminHome";
	}
	@GetMapping("/viewPlaylist")
	public String viewPlaylist(Model model) {
		List<Playlist> allPlaylist=playlistService.fetchAllPlaylists();
		model.addAttribute("allPlaylist",allPlaylist);
		return "displayPlaylists";
	}
	
	
}
