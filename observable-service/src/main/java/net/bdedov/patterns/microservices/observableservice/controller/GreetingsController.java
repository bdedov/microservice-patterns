package net.bdedov.patterns.microservices.observableservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greetings")
public class GreetingsController {

	@GetMapping
	public ResponseEntity<String> greet() {
		return ResponseEntity.ok().body("Hello world!");
	}

}
