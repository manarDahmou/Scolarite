package com.evotixit.GestionDossiers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.evotixit.GestionDossiers.models.Demande;
import com.evotixit.GestionDossiers.models.Eleve;
import com.evotixit.GestionDossiers.models.Groupe;

@Repository
public interface EleveRepository extends JpaRepository<Eleve, Integer>{
	@Query("SELECT u FROM Eleve u WHERE u.emailParent = ?1")
	public List<Eleve> findByEmail(String email);
	
	@Query("SELECT u FROM Eleve u WHERE u.codePermanent = ?1")
	public Eleve findByCode(Integer code);
	
	@Query("SELECT u FROM Eleve u WHERE u.codePermanent != ?1")
	public Eleve findByCodePermanant(Integer code); 
	
	@Query("SELECT u FROM Eleve u WHERE u.groupe = ?1")
	public List<Eleve> findEleveByCode(String groupe); 
	
	@Query("SELECT u FROM Eleve u WHERE u.parentName = ?1")
	public List<Eleve> findParParent(String nom);  
	
	@Query("SELECT u FROM Eleve u WHERE u.groupe = ?1")
	public List<Eleve> eleveByGroupe(String groupe);
	
	@Query("SELECT u FROM Eleve u WHERE u.etablissementScolaire = ?1")
	public List<Eleve> findByEtablissement(String nom); 
	
	
	
}
