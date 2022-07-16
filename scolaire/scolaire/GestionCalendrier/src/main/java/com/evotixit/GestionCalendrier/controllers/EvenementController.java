package com.evotixit.GestionCalendrier.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evotixit.GestionCalendrier.models.Evenement;
import com.evotixit.GestionCalendrier.services.EvenementService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api/calendriers")
public class EvenementController {
	@Autowired
	private EvenementService evenementService;

	

	@PostMapping("/saisirEvenement")
	public Evenement saisirEvenement(@RequestBody Evenement evenement, HttpServletRequest request){

		return evenementService.saisirEvenement(evenement);

		 
	}	
	@GetMapping("/getEvenementByGroupe/{groupe}")
	public List<Evenement> getEvenementByGroupe(@PathVariable String groupe) {
		return evenementService.getEvenementByGroupe(groupe);
	}
	
}