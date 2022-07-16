package com.evotixit.GestionResultats.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Examen")
public class Examen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Examen_ID")
	private Integer id;

	@Column
	private String nomMatiere; 
	
	@Column
	private String dateExamen;
	
	@Column
	private String groupe;

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

	public String getDateExamen() {
		return dateExamen;
	}

	public void setDateExamen(String dateExamen) {
		this.dateExamen = dateExamen;
	}

	public String getGroupe() {
		return groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}

	public Examen(Integer id, String nomMatiere, String dateExamen, String groupe) {
		super();
		this.id = id;
		this.nomMatiere = nomMatiere;
		this.dateExamen = dateExamen;
		this.groupe = groupe;
	}

	public Examen() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
