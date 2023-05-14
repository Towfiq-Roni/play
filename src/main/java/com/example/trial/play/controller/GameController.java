package com.example.trial.play.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
	@GetMapping("/1")
	public String index() {
		return "Second One!";
	}
} 
