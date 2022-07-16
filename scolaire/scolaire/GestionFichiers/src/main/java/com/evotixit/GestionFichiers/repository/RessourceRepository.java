package com.evotixit.GestionFichiers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.evotixit.GestionFichiers.models.Doc;

public interface RessourceRepository extends JpaRepository<Doc,Integer>{
	@Query("SELECT u FROM Doc u WHERE u.groupe = ?1")
	public List<Doc> findByGroupe(String groupe);
	
}
