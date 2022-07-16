package com.evotixit.GestionDossiers.controllers;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evotixit.GestionDossiers.models.Demande;
import com.evotixit.GestionDossiers.models.Eleve;
import com.evotixit.GestionDossiers.models.Groupe;
import com.evotixit.GestionDossiers.models.Niveau;
import com.evotixit.GestionDossiers.service.UserService;


import net.bytebuddy.utility.RandomString;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api/eleves")
public class UserController {

	@Autowired
	private UserService userService;

	//

	@PostMapping("/addDemandeEleve")
	public String createDemande(@RequestBody Demande demande, HttpServletRequest request){

		userService.addDemande(demande);

		return "";
	}
	
	@GetMapping("/eleve/{email}")
	public List<Eleve> getEleveByEmail(@PathVariable String email) {
		return userService.findEleveByEmail(email);
	}
	

	@GetMapping("/Demande")
	public List<Demande> getAllDemandes() {
		return userService.getAllDemandes();
	}

	@DeleteMapping("Demande/{id}")
	public void delete(@PathVariable Integer id) {
		userService.deleteDemande(id);
	}
	@GetMapping("Demande/{id}")
	public Demande getDemande(@PathVariable Integer id) {
		return userService.findDemandeById(id);
	}
	@PostMapping("/eleve")
	public Eleve accepteDemande(@RequestBody Eleve eleve, HttpServletRequest request) {

		return	userService.accepteDemande(eleve);

	}
	@GetMapping("/Eleves")
	public List<Eleve> getAllEleves() {
		return userService.getAllEleves();
	}
	@GetMapping("/Demandes/{etablissementScolaire}")
	public List<Demande> getDemandByEtablissement(@PathVariable String etablissementScolaire) {
		return userService.findDemandeByEtablissement(etablissementScolaire);
	}

	@GetMapping("codeEleve/{code}")
	public Eleve getEleve(@PathVariable Integer code) {
		return userService.findEleveByCode(code);
	}
	
	@PutMapping("updateEtattrue/{etablissementScolaire}")  
	public Eleve updateEtattrue(@PathVariable String etablissementScolaire , @RequestBody Eleve eleve ) {
		eleve.setEtatEtablissement(true);
		return userService.updateEtat(eleve);
	}
	@PutMapping("updateEtatfalse/{etablissementScolaire}")  
	public Eleve updateEtatfalse(@PathVariable String etablissementScolaire , @RequestBody Eleve eleve ) {
		eleve.setEtatEtablissement(false);
		return userService.updateEtat(eleve);
	}
	@PostMapping("/niveau")
	public Niveau createNiveau(@RequestBody Niveau niveau) {
		
		return userService.addNiveau(niveau);

	}
	
	@GetMapping("/getNiveau")
	public List<Niveau> getNiveau() {
		
		return userService.getNiveau();

	}
	
	
	
	@PostMapping("/groupe")
	public Groupe createGroupe(@RequestBody Groupe groupe) {
		
		return userService.addGroupe(groupe);

	}
	@GetMapping("/getGroupe")
	public List<Groupe> getGroupe() {
		
		return userService.getGroupe();

	}
	
	@GetMapping("/groupe/{id}")
	public Groupe getGroupeId(@PathVariable Integer id) {
		return userService.getGroupeById(id);
	}
	@GetMapping("/eleveId/{id}")
	public Eleve getEleveXId(@PathVariable Integer id) {
		return userService.getEleveById(id);
	}
	@PutMapping("updateGroupeEleve/{id}/{eleveGroupe}")
	public Eleve updateEleveGroupe(@PathVariable Integer id, @PathVariable String eleveGroupe, @RequestBody Eleve eleve ) {
		eleve.setGroupe(eleveGroupe);

		return userService.updateGroupeEleve(eleve );
	}
	@GetMapping("{nom}/eleveByNameParent")
	List<Eleve> eleveByNameParent(@PathVariable String nom) {
		return userService.eleveByNameParent(nom);
	}
	@GetMapping("eleveByCode/{groupe}")
	List<Eleve> eleveByGroupe(@PathVariable String groupe) {
		return userService.eleveByGroupe(groupe);
	}
	@GetMapping("{nom}/eleveByEtablissement")
	List<Eleve> eleveByNameEtablissement(@PathVariable String nom) {
		return userService.eleveByNameEtablissement(nom);
	}
	@GetMapping("{nom}/groupeByName")
	List<Groupe> groupeByName(@PathVariable String nom) {
		return userService.groupeByName(nom);
	}
	
}