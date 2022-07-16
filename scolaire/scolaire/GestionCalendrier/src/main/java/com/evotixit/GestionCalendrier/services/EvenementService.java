package com.evotixit.GestionCalendrier.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.evotixit.GestionCalendrier.models.Evenement;



public interface EvenementService {
	public Evenement saisirEvenement(Evenement evenement) ;
	public List<Evenement> getEvenementByGroupe(String groupe) ;
	}
