package com.evotixit.GestionResultats.controllers;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

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

import com.evotixit.GestionResultats.models.Bulletin;
import com.evotixit.GestionResultats.models.Examen;
import com.evotixit.GestionResultats.models.Matiere;
import com.evotixit.GestionResultats.models.MatiereEnseignant;
import com.evotixit.GestionResultats.models.Resultat;
import com.evotixit.GestionResultats.service.ResultatService;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api/resultats")
public class ResultatController {

	@Autowired
	private ResultatService resultatService;

	
	@PostMapping("/addMatiere")
	public Matiere addMatiere(@RequestBody Matiere matiere) {
		
		return resultatService.addMatiere(matiere);

	}
	@PostMapping("/publierBulletin")
	public Resultat publierBulletin(@RequestBody Resultat resultat) {
		
		return resultatService.publierBulletin(resultat);

	}
	@PostMapping("/moyenne")
	public Bulletin publierMoyenee(@RequestBody Bulletin bulletin) {
		
		return resultatService.moyenne(bulletin);

	}
	@PostMapping("/planifierExamen")
	public Examen planifierExamene(@RequestBody Examen examen) {
		
		return resultatService.PlanifierExamen(examen);

	}
	@GetMapping("/matieres")
	public List<Matiere> getAllMatiere() {
		
		return resultatService.getAllMatieres();
		
	}
	@GetMapping("/resultatByCode/{codePermanent}")
	public List<Resultat> getResultatByCode(@PathVariable Integer codePermanent) {
		
		return resultatService.getAllResultByCode(codePermanent);

	}
	@GetMapping("/bulletinByCode/{codePermanent}")
	public Bulletin getBulletinByCode(@PathVariable Integer codePermanent) {
		
		return resultatService.getBulletinByCode(codePermanent);

	}
	@GetMapping("/matieresEnseignee")
	public List<MatiereEnseignant> getAllMatiereEnseigner() {
		
		return resultatService.getAllMatieresEnseignee();

	}
	@GetMapping("{nom}/enseignantGroupe")
	public List<MatiereEnseignant> getEnseignantGroupe(@PathVariable String nom) {
		
		return resultatService.getEnseignantGroupe(nom);

	}
	@GetMapping("/{groupe}/getEnseignantByGroupe")
	public List<MatiereEnseignant> getEnseignantByGroupe(@PathVariable String groupe) {
		
		return resultatService.getEnseignantByGroupe(groupe);

	}
	@GetMapping("/getExamenByGroupe/{groupe}")
	public List<Examen> getExamenByGroupe(@PathVariable String groupe) {
		
		return resultatService.getExamenByGroupe(groupe);

	}
	@PutMapping("modifierMatiere/{id}")  
	public Matiere modifierMatiere(@PathVariable Integer id , @RequestBody Matiere matiere ) {
		return resultatService.modifierMatiere(matiere);
	}
	@DeleteMapping("annulerMatiere/{id}")
	public void annulerMatiere(@PathVariable Integer id) {
		resultatService.annulerMatiere(id);
	}
	@GetMapping("getMatiereByID/{id}")
	public Matiere getMatiereByID(@PathVariable Integer id) {
		return resultatService.getMatiereByID(id);
	}
	
	@PostMapping("/affecterMatiereEnseignant")
	public MatiereEnseignant affecterMatiereEnseignant(@RequestBody MatiereEnseignant ME) {
		
		return resultatService.AffecterMatiereEnseignant(ME);

	}
	@GetMapping("/enseignantParMatiere/{matiere}")
	public List<MatiereEnseignant> getEnseignantParMatiere(@PathVariable String matiere) {
		return resultatService.getEnseignantParMatiere(matiere);
	}
	@GetMapping("/getMatiereEnseignantByID/{id}")
	public Optional<MatiereEnseignant> getMatiereEnseignantByID(@PathVariable Integer id) {
		return resultatService.getById(id);
	}
	
	
}
