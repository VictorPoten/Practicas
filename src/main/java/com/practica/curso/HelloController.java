package com.practica.curso;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Welcome user";
	}
	
	@GetMapping("/userget/{name}")
	public String name(@PathVariable String name) {
		return String.format ("Welcome %s" , name);
	}
	
	@PostMapping("/userpost/{name}")
	public String name2(@RequestBody String name) {
		return String.format ("Welcome %s" , name);
	}
	
}
