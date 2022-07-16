package com.evotixit.GestionAbsences.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.evotixit.GestionAbsences.models.Absence;
import com.evotixit.GestionAbsences.models.AbsencePrevue;

@Repository
public interface AbsencePrevueRepository extends JpaRepository<AbsencePrevue, Integer> {

}
