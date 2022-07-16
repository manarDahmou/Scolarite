package com.evotixit.GestionDossiers.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import com.evotixit.GestionDossiers.models.Demande;
import com.evotixit.GestionDossiers.models.Eleve;
import com.evotixit.GestionDossiers.models.Groupe;
import com.evotixit.GestionDossiers.models.Niveau;

//import javax.mail.MessagingException;



public interface UserService {
	
	public Demande addDemande(Demande demande) ;
	public List<Demande> getAllDemandes() ;
	public void deleteDemande(Integer id) ;
	public Demande findDemandeById(Integer id) ;
	public Eleve accepteDemande(Eleve eleve) ;
	public Eleve updateEtat(Eleve eleves) ;
	public List<Eleve> getAllEleves() ;
	public List<Eleve> findEleveByEmail(String email) ;
	public List<Demande> findDemandeByEtablissement(String etablissementScolaire) ;
	public List<Eleve> findEleveByEmailSaufx(String email , Integer code) ;
	public Eleve findEleveByCode(Integer code) ;
	  
	public Niveau addNiveau(Niveau niveau) ;
	public List<Niveau> getNiveau() ;
	
	public Groupe addGroupe(Groupe groupe) ;
	public List<Groupe> getGroupe() ;
	public Groupe getGroupeById(Integer id) ;
	public Eleve getEleveById(Integer id) ;
	public Eleve updateGroupeEleve(Eleve eleves) ;
	public List<Eleve> getElevebyGroupe(String  groupe) ;
	public List<Eleve> 	eleveByNameParent(String nom) ;
	public List<Eleve> 	eleveByGroupe(String groupe) ;
	public List<Eleve> 	eleveByNameEtablissement(String nom) ;
	public List<Groupe> groupeByName(String nom) ;


}
