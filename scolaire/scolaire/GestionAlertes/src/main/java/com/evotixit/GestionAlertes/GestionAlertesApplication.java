package com.evotixit.GestionAlertes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GestionAlertesApplication {
	public static void main(String[] args) {
		SpringApplication.run(GestionAlertesApplication.class, args);
	}
}
