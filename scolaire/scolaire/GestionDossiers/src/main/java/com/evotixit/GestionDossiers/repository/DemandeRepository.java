package com.evotixit.GestionDossiers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.evotixit.GestionDossiers.models.Demande;
import com.evotixit.GestionDossiers.models.Eleve;

@Repository

public interface DemandeRepository extends JpaRepository<Demande, Integer>{
	
	@Query("SELECT u FROM Demande u WHERE u.etablissementScolaire = ?1")
	public List<Demande> findByEtablissement(String etablissementScolaire);
	
}
