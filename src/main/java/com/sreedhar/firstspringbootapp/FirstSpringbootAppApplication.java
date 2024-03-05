package com.sreedhar.firstspringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FirstSpringbootAppApplication {



	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootAppApplication.class, args);
	}

}
