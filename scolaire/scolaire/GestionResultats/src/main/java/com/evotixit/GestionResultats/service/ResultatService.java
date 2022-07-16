package com.evotixit.GestionResultats.service;

import java.util.List;
import java.util.Optional;

import com.evotixit.GestionResultats.models.Bulletin;
import com.evotixit.GestionResultats.models.Examen;
import com.evotixit.GestionResultats.models.Matiere;
import com.evotixit.GestionResultats.models.MatiereEnseignant;
import com.evotixit.GestionResultats.models.Resultat;


public interface ResultatService {
	public MatiereEnseignant AffecterMatiereEnseignant(MatiereEnseignant ME) ;
	public List<MatiereEnseignant> getEnseignantParMatiere(String matiere) ;
	public Resultat publierBulletin(Resultat resultat) ;
	public Bulletin moyenne(Bulletin bulletin) ;
	public Optional<MatiereEnseignant> getById(Integer id) ;
	public List<MatiereEnseignant> getEnseignantByGroupe(String groupe) ;
	public List<Resultat> getAllResultByCode(Integer code) ;
	public Bulletin getBulletinByCode(Integer codePermanent) ;
	public Matiere addMatiere(Matiere matiere) ;
	public List<Matiere> getAllMatieres() ;
	public Matiere modifierMatiere(Matiere matieres ) ;
	public void annulerMatiere(Integer id);
	public Matiere getMatiereByID(Integer id) ;
	public List<MatiereEnseignant> getAllMatieresEnseignee() ;
	public Examen PlanifierExamen(Examen examen) ;
	public List<Examen> getExamenByGroupe(String groupe) ;
	public List<MatiereEnseignant> getEnseignantGroupe(String nom) ;

}
