package com.evotixit.GestionFichiers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GestionFichiersApplication {
	public static void main(String[] args) {
		SpringApplication.run(GestionFichiersApplication.class, args);
	}
}