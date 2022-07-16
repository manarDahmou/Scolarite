package com.evotixit.GestionResultats.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.evotixit.GestionResultats.models.MatiereEnseignant;


@Repository
public interface MatiereEnseignantRepository extends JpaRepository<MatiereEnseignant, Integer>{
	
	@Query("SELECT u FROM MatiereEnseignant u WHERE u.nomMatiere = ?1")
	public List<MatiereEnseignant> findParMatiere(String matiere); 
	@Query("SELECT u FROM MatiereEnseignant u WHERE u.nomEnseignant = ?1")
	public List<MatiereEnseignant> findByEnseignant(String nom); 
	@Query("SELECT u FROM MatiereEnseignant u WHERE u.groupe = ?1")
	public List<MatiereEnseignant> findByGroupe(String groupe);
}
