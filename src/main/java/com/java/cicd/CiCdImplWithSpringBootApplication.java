package com.java.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdImplWithSpringBootApplication {

	@GetMapping("welcome")
	public String getMessage() {
		return "Welcome to CI/CD implementation";
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CiCdImplWithSpringBootApplication.class, args);
		System.out.println("Welcome to CI/CD implementation");
	}

}
