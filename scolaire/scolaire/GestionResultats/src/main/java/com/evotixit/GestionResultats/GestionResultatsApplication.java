package com.evotixit.GestionResultats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@SpringBootApplication
@EnableFeignClients

public class GestionResultatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionResultatsApplication.class, args);
	}

}
