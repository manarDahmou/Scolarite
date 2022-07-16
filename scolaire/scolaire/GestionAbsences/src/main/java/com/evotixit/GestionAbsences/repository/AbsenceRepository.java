package com.evotixit.GestionAbsences.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.evotixit.GestionAbsences.models.Absence;
import java.util.List;


@Repository
public interface AbsenceRepository extends JpaRepository<Absence, Integer> {

	@Query("SELECT u FROM Absence u WHERE u.codePermanent = ?1")
	public List<Absence> findByCode(Integer codePermanent);
	
}
