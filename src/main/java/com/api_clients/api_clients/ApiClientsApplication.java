package com.api_clients.api_clients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
public class ApiClientsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiClientsApplication.class, args);
	}

	@RestController
	@RequestMapping("/hello")
	public static class HelloController {

		@GetMapping
		public String sayHello() {
			return "Hello, World! 🚀 Spring Boot está rodando!";
		}
	}
}
