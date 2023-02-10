package com.EssJava.org.Controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class VistaCont {
	
	
	//prima Pagina  HOME
	
	@GetMapping("/home")
	  public String home(Model model) {
	    model.addAttribute("Nome", "Angelo");
	    return "home";
	  }
	
	
	@GetMapping("/movies")
	  public String movies(Model m) {
	    List<Movie> movies = getBestMovies();
	    m.addAttribute("titolo", movies.toString());
	    return "movies";
	  }
	
	
	
	
	private List<Movie> getBestMovies() {
		
		List<Movie> movies = new ArrayList<>();
		
		Movie movie1 = new Movie("Il ritorno di Angelo", 1);
		movies.add(movie1);
		
		Movie movie2 = new Movie("Angelo e MIT", 2);
		movies.add(movie1);
		return movies;
		
	}
	


}


