package com.cognizant.com;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class GreetService {

	@GetMapping("/greet")
	public String greetService() {
		return "Good Morning..";
	}
}
