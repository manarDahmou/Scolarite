package com.evotixit.GestionAlertes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.evotixit.GestionAlertes.models.MessageGroupe;

@Repository
public interface MessageGroupeRepository extends JpaRepository<MessageGroupe, Integer> {
	@Query("SELECT u FROM MessageGroupe u WHERE u.groupe = ?1")
     public List<MessageGroupe> getMessageGroupe(String nom); 
}
