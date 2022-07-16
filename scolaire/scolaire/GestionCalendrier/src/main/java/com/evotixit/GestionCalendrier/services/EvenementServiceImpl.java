package com.evotixit.GestionCalendrier.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evotixit.GestionCalendrier.models.Evenement;
import com.evotixit.GestionCalendrier.repository.EvenementRepository;


@Service
@Transactional
public class EvenementServiceImpl implements EvenementService {

	@Autowired
	private EvenementRepository evenementRepository;
	
	@Override
	public Evenement saisirEvenement(Evenement evenement) {

		return evenementRepository.save(evenement);
	}
	@Override
	public List<Evenement> getEvenementByGroupe(String groupe) {

			return evenementRepository.findByGroupe(groupe);		
	}
}