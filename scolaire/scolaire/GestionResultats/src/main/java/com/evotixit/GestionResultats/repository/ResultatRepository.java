package com.evotixit.GestionResultats.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.evotixit.GestionResultats.models.Resultat;

@Repository
public interface ResultatRepository extends JpaRepository<Resultat,Integer>{
	@Query("SELECT u FROM Resultat u WHERE u.codePermanent = ?1")
	public List<Resultat> findResultatByCode(Integer codePermanent); 
	
	
}
