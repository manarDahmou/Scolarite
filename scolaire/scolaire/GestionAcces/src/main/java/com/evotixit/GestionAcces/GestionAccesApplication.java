package com.evotixit.GestionAcces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class GestionAccesApplication {
  
	public static void main(String[] args) {
		SpringApplication.run(GestionAccesApplication.class, args);
	}

}
