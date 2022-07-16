package com.evotixit.GestionDossiers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.evotixit.GestionDossiers.models.Groupe;

@Repository
public interface GroupeRepository extends JpaRepository<Groupe, Integer> {
	@Query("SELECT u FROM Groupe u WHERE u.nomEtablissement = ?1")
	public List<Groupe> getgroupeByName(String nom); 
}
     