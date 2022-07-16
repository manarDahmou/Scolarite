package com.evotixit.GestionAlertes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.evotixit.GestionAlertes.models.MessageGroupe;
import com.evotixit.GestionAlertes.models.MessageIndividuelle;

@Repository
public interface MessageIndividuelleRepository extends JpaRepository<MessageIndividuelle, Integer> {
	@Query("SELECT u FROM MessageIndividuelle u WHERE u.groupe = ?1")
    public List<MessageIndividuelle> getMessageIndividuelle(String nom);
	@Query("SELECT u FROM MessageIndividuelle u WHERE u.type = ?1")
    public List<MessageIndividuelle> getReclamationsType(String type);
	@Query("SELECT u FROM MessageIndividuelle u WHERE u.nomEnseignant = ?1")
    public List<MessageIndividuelle> getMessageParent(String type);
}
