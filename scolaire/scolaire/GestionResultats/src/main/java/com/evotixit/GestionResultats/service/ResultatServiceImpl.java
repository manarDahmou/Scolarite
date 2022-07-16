package com.evotixit.GestionResultats.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evotixit.GestionResultats.models.Bulletin;
import com.evotixit.GestionResultats.models.Examen;
import com.evotixit.GestionResultats.models.Matiere;
import com.evotixit.GestionResultats.models.MatiereEnseignant;
import com.evotixit.GestionResultats.models.Resultat;
import com.evotixit.GestionResultats.repository.BulletinRepository;
import com.evotixit.GestionResultats.repository.ExamenRepository;
import com.evotixit.GestionResultats.repository.MatiereEnseignantRepository;
import com.evotixit.GestionResultats.repository.MatiereRepository;
import com.evotixit.GestionResultats.repository.ResultatRepository;

@Service
@Transactional
public class ResultatServiceImpl implements ResultatService {

	@Autowired
	private MatiereRepository matiereRepository;
	@Autowired
	private MatiereEnseignantRepository matiereEnseignantRepository;
	@Autowired
	private ExamenRepository examenRepository;
	@Autowired
	private ResultatRepository resultatRepository;
	@Autowired
	private BulletinRepository bulletinRepository;

	@Override
	public Matiere addMatiere(Matiere matiere) {
		return matiereRepository.save(matiere);
	}

	@Override
	public Bulletin moyenne(Bulletin bulletin) {
		return bulletinRepository.save(bulletin);
	}

	@Override
	public Resultat publierBulletin(Resultat resultat) {
		return resultatRepository.save(resultat);
	}

	@Override
	public Examen PlanifierExamen(Examen examen) {
		return examenRepository.save(examen);
	}

	@Override
	public List<Examen> getExamenByGroupe(String groupe) {

		return examenRepository.findExamenBygroupe(groupe);
	}

	@Override
	public List<Resultat> getAllResultByCode(Integer codePermanent) {
		return resultatRepository.findResultatByCode(codePermanent);
	}
	@Override
	public Bulletin getBulletinByCode(Integer codePermanent) {
		return bulletinRepository.findBulletinByCode(codePermanent);
	}

	@Override
	public List<Matiere> getAllMatieres() {
		return matiereRepository.findAll();
	}

	@Override
	public List<MatiereEnseignant> getAllMatieresEnseignee() {
		return matiereEnseignantRepository.findAll();
	}
	@Override
	public List<MatiereEnseignant> getEnseignantGroupe(String nom) {
		return matiereEnseignantRepository.findByEnseignant(nom);
	}
	@Override
	public Matiere modifierMatiere(Matiere matieres) {

		return matiereRepository.save(matieres);
	}

	@Override
	public void annulerMatiere(Integer id) {
		matiereRepository.deleteById(id);
	}

	@Override
	public Matiere getMatiereByID(Integer id) {
		Optional<Matiere> matieres = matiereRepository.findById(id);
		return matieres.isPresent() ? matieres.get() : null;
	}

	@Override
	public MatiereEnseignant AffecterMatiereEnseignant(MatiereEnseignant ME) {

		return matiereEnseignantRepository.save(ME);
	}

	@Override
	public List<MatiereEnseignant> getEnseignantParMatiere(String matiere) {

		return matiereEnseignantRepository.findParMatiere(matiere);
	}
	@Override
	public List<MatiereEnseignant> getEnseignantByGroupe(String groupe) {

		return matiereEnseignantRepository.findByGroupe(groupe);
	}
	
	@Override
	public Optional<MatiereEnseignant> getById(Integer id) {

		return matiereEnseignantRepository.findById(id);
	}
}
