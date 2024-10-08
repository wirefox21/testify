package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloworld2")

public class IndexController {
	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("message", "Hello Spring Boot!");
		return "index";
	}

}
