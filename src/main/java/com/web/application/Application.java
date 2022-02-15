package com.web.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "/api")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping(value = "/info")
	public String getInfo(){
		return "Hello, I'm springboot :)";
	}
}
