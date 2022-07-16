package com.evotixit.GestionDossiers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evotixit.GestionDossiers.models.Niveau;

@Repository
public interface NiveauRepository extends JpaRepository<Niveau, Integer>{

}
