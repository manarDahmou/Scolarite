package com.evotixit.GestionResultats.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Resultat")
public class Resultat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	@Column
	private String nomMatiere;
	
	@Column
	private String noteMatiere;
	
	
	
	@Column
	private String groupe;
	
	@Column
	private String firstName;

	@Column
	private String lastName;
	
	@Column
	private Integer codePermanent;

	
	@Column
	private String etablissementScolaire;
	
	@Column
	private String niveau;
	@Column
	private Integer coefficient;

	@Column
	private String year;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomMatiere() {
		return nomMatiere;
	}

	public void setNomMatiere(String nomMatiere) {
		this.nomMatiere = nomMatiere;
	}

	public String getNoteMatiere() {
		return noteMatiere;
	}

	public void setNoteMatiere(String noteMatiere) {
		this.noteMatiere = noteMatiere;
	}

	

	public String getGroupe() {
		return groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getCodePermanent() {
		return codePermanent;
	}

	public void setCodePermanent(Integer codePermanent) {
		this.codePermanent = codePermanent;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	
	
	public Integer getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(Integer coefficient) {
		this.coefficient = coefficient;
	}

	public String getEtablissementScolaire() {
		return etablissementScolaire;
	}

	public void setEtablissementScolaire(String etablissementScolaire) {
		this.etablissementScolaire = etablissementScolaire;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}



	

	

	public Resultat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Resultat(Integer id, String nomMatiere, String noteMatiere, Integer coefficient, String groupe,
			String firstName, String lastName, Integer codePermanent, Integer moyenne, String etablissementScolaire,
			String niveau, String year) {
		super();
		this.id = id;
		this.nomMatiere = nomMatiere;
		this.noteMatiere = noteMatiere;
		this.groupe = groupe;
		this.firstName = firstName;
		this.lastName = lastName;
		this.codePermanent = codePermanent;
		this.etablissementScolaire = etablissementScolaire;
		this.niveau = niveau;
		this.year = year;
		this.coefficient = coefficient ;
	}
	
	
	
}
