package com.EssJava.org.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class VistaCont {
	
	//prima Pagina  HOME
	
	@GetMapping("/home")
	public String home() {
		return "Home";
	}
}
