package com.evotixit.GestionResultats.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.evotixit.GestionResultats.models.Examen;

@Repository
public interface ExamenRepository extends JpaRepository<Examen, Integer> {
	
	@Query("SELECT u FROM Examen u WHERE u.groupe = ?1")
	public List<Examen> findExamenBygroupe(String groupe);
	
}
