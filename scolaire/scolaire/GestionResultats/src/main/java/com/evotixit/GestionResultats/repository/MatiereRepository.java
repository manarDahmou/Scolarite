package com.evotixit.GestionResultats.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evotixit.GestionResultats.models.Matiere;


@Repository
public interface MatiereRepository extends JpaRepository<Matiere, Integer> {

}
