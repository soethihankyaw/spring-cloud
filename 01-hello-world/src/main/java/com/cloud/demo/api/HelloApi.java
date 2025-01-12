package com.cloud.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.demo.entity.Username;

@RestController
@RequestMapping("/hello")
public class HelloApi {
		
	@GetMapping("{firstName}")
	public String hello(
			@PathVariable String firstName,
			@RequestParam String secondName
			) {
		return String.format(
				"{\"message\":\"Hello %s %s\"}", firstName, secondName
				);
	}
	
	@PostMapping
	public String hello(
			@RequestBody Username form
			) {
		return String.format(
				"{\"message\":\"Hello %s %s\"}", form.firstName(), form.secondName()
				);
	}
}
