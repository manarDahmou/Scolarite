package com.evotixit.GestionCalendrier.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.evotixit.GestionCalendrier.models.Evenement;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Integer> {
	@Query("SELECT u FROM Evenement u WHERE u.groupe = ?1")
	public List<Evenement> findByGroupe(String groupe);

}
