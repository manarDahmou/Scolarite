package com.evotixit.GestionAcces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evotixit.GestionAcces.models.Etablissement;

@Repository
public interface EtablissementRepository extends JpaRepository<Etablissement, Integer>{

}
