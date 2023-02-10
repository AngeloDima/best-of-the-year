package com.EssJava.org.Controller;

import java.time.LocalTime;

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
}


