package com.evotixit.GestionDossiers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@SpringBootApplication
@EnableFeignClients

public class GestionDossiersApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDossiersApplication.class, args);
	}

}
