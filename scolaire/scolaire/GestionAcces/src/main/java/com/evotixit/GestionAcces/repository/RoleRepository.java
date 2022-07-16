package com.evotixit.GestionAcces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evotixit.GestionAcces.models.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}