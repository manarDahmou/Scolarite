package com.evotixit.GestionDossiers.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="gestion-accees",url = "http://localhost:8081")
public interface GestionAccesService {

}
