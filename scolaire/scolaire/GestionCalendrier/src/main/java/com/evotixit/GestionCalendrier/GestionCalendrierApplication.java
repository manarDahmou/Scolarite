package com.evotixit.GestionCalendrier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication
@EnableFeignClients
public class GestionCalendrierApplication {
	public static void main(String[] args) {
		SpringApplication.run(GestionCalendrierApplication.class, args);
	}
}
