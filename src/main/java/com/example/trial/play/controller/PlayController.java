package com.example.trial.play.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayController {

	@GetMapping("/")
	public String index() {
		return "First One!";
	}
}
