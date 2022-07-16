package com.evotixit.GestionResultats.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.evotixit.GestionResultats.models.Bulletin;


@Repository
public interface BulletinRepository extends JpaRepository<Bulletin,Integer>{
	@Query("SELECT u FROM Bulletin u WHERE u.codePermanent = ?1")
	public Bulletin findBulletinByCode(Integer codePermanent); 
}
