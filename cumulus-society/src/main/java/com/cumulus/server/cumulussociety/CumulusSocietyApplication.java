package com.cumulus.server.cumulussociety;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.cumulus.server")
@EntityScan(basePackages = "com.cumulus.server.model")
@EnableJpaRepositories(basePackages = "com.cumulus.server.repo")
public class CumulusSocietyApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(CumulusSocietyApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace(); 
		}	}

		

}
