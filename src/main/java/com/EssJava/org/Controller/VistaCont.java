package com.EssJava.org.Controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.EssJava.org.Model.Movie;
import com.EssJava.org.Model.Song;



@Controller
@RequestMapping("/")
public class VistaCont {
	
	
	@GetMapping()
	public String home(Model model) {  
		String name = "Angelo";
		model.addAttribute("name", name);
		return "index"; // nome file che voglio restituire
	}
	
	private List<Movie> getBestMovie(){
		List<Movie> moviesList = new ArrayList<>(); 
		Movie movie1= new Movie(1, "Gomorra");
		Movie movie2= new Movie(2, "Il Padrino");
		Movie movie3= new Movie(3, "la bella e la bestia");
		moviesList.add(movie1);
		moviesList.add(movie2);
		moviesList.add(movie3);
		return moviesList;
		
	}
	@GetMapping("/movies")
	public String showMovies(Model model) {
		List<Movie> movies= getBestMovie();
		model.addAttribute("films" , movies);
		return "movies";
	}
	
	private List<Song> getBestSong(){
		List<Song> songsList = new ArrayList<>(); 
		Song song1= new Song(1, "i carusi do sud");
		Song song2= new Song(2, "oro e argento");
		songsList.add(song1);
		songsList.add(song2);
		return songsList;
	}
	
	@GetMapping("/songs")
	public String showSong(Model model) {
		List<Song> songs= getBestSong();
		model.addAttribute("canzoni" , songs);
		return "songs";
	}
	
	@GetMapping("/songs/{id}") 	
	public String dettaglioCanzone(Model model, @PathVariable("id") String id ) {
		int idSong= Integer.parseInt(id)-1;
		model.addAttribute("song", getBestSong().get(idSong));
		return "canzone";
	}
	
	@GetMapping("/movies/{id}") 	
	public String dettaglioFilm(Model model, @PathVariable("id") String id ) {
		int idFilm= Integer.parseInt(id)-1;
		model.addAttribute("film", getBestMovie().get(idFilm));
		return "film";
	}


}