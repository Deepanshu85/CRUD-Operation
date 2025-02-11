package com.tericcabrel.auth_api; // FIXED package name

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.tericcabrel.auth_api.entities") // Ensure Spring Boot scans the correct entity package
@EnableJpaRepositories("com.tericcabrel.auth_api.repositories") // Ensure repository is scanned
public class AuthApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(AuthApiApplication.class, args);
	}
}
