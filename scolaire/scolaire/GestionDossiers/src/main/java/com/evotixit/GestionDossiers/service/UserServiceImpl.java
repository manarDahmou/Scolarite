package com.evotixit.GestionDossiers.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evotixit.GestionDossiers.repository.DemandeRepository;
import com.evotixit.GestionDossiers.repository.EleveRepository;
import com.evotixit.GestionDossiers.repository.GroupeRepository;

import com.evotixit.GestionDossiers.repository.NiveauRepository;
import com.evotixit.GestionDossiers.models.Demande;
import com.evotixit.GestionDossiers.models.Eleve;
import com.evotixit.GestionDossiers.models.Groupe;

import com.evotixit.GestionDossiers.models.Niveau;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private DemandeRepository demandeRepository;
	@Autowired
	private GroupeRepository groupeRepository;
	@Autowired
	private EleveRepository eleveRepository;
	@Autowired
	private NiveauRepository niveauRepository;
	public String code;

	@Override
	public Demande addDemande(Demande demande) {

		return demandeRepository.save(demande);
	}

	@Override
	public List<Demande> getAllDemandes() {
		return demandeRepository.findAll();
	}

	@Override
	public void deleteDemande(Integer id) {
		demandeRepository.deleteById(id);
	}

	@Override
	public Demande findDemandeById(Integer id) {
		Optional<Demande> demandes = demandeRepository.findById(id);
		return demandes.isPresent() ? demandes.get() : null;
	}

	@Override
	public Eleve accepteDemande(Eleve eleve) {
		eleve.setCodePermanent(eleve.getId());
		eleve.setEtatEtablissement(true);
		return eleveRepository.save(eleve);
	}

	@Override
	public List<Eleve> getAllEleves() {
		return eleveRepository.findAll();
	}

	@Override
	public List<Eleve> findEleveByEmail(String email) {
		return eleveRepository.findByEmail(email);
	}

	@Override
	public List<Demande> findDemandeByEtablissement(String etablissementScolaire) {
		return demandeRepository.findByEtablissement(etablissementScolaire);
	}

	@Override
	public List<Eleve> findEleveByEmailSaufx(String email, Integer code) {

		return eleveRepository.findByEmail(email);
	}

	@Override
	public Eleve findEleveByCode(Integer code) {

		return eleveRepository.findByCode(code);
	}

	@Override
	public Eleve updateEtat(Eleve eleves) {

		return eleveRepository.save(eleves);
	}

	@Override
	public Niveau addNiveau(Niveau niveau) {
		return niveauRepository.save(niveau);
	}
	
	@Override
	public List<Niveau> getNiveau() {
		return niveauRepository.findAll();
	}

	@Override
	public Groupe addGroupe(Groupe groupe) {
		return groupeRepository.save(groupe);
	}

	@Override
	public List<Groupe> getGroupe() {
		return groupeRepository.findAll();
	}

	@Override
	public Groupe getGroupeById(Integer id) {
		Optional<Groupe> groupes = groupeRepository.findById(id);
		return groupes.isPresent() ? groupes.get() : null;

	}

	@Override
	public Eleve getEleveById(Integer id) {
		Optional<Eleve> eleves = eleveRepository.findById(id);
		return eleves.isPresent() ? eleves.get() : null;

	}

	@Override
	public Eleve updateGroupeEleve(Eleve eleves ) {
	
		return eleveRepository.save(eleves);
	}
	@Override
	public List<Eleve> getElevebyGroupe(String groupe) {

		return eleveRepository.findEleveByCode(groupe);
	}
	@Override 
	public List<Eleve> 	eleveByNameParent(String nom) {

		return eleveRepository.findParParent(nom);
	}
	@Override 
	public List<Eleve> 	eleveByGroupe(String groupe) {

		return eleveRepository.eleveByGroupe(groupe);
	}
	@Override 
	public List<Eleve> 	eleveByNameEtablissement(String nom) {

		return eleveRepository.findByEtablissement(nom);
	}
	@Override 
	public List<Groupe> groupeByName(String nom) {

		return groupeRepository.getgroupeByName(nom);
	}
	
	
}