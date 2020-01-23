package net.bdedov.patterns.microservices.crosscuttingservice.controller;

import lombok.RequiredArgsConstructor;
import net.bdedov.patterns.microservices.crosscuttingservice.config.GreetingsConfig;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greetings")
@RequiredArgsConstructor
public class GreetingsController {

	private final GreetingsConfig greetingsConfig;

	@GetMapping
	public ResponseEntity<String> greet() {
		return ResponseEntity.ok().body(String.format("Hello, %s!", greetingsConfig.getLocation()));
	}

}
