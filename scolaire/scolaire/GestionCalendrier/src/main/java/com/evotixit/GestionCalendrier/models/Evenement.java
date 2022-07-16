package com.evotixit.GestionCalendrier.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Evenement")
public class Evenement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Evenement_ID")
	private Integer id;
	
	@Column
	private String nomEvenement;
	@Column
	private String typeEvenement;
	@Column
	private String year;
	@Column
	private String groupe;
	@Column
	private String dateEvenement;
	@Column
	private String heureDebut;
	@Column
	private String heureFin;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomEvenement() {
		return nomEvenement;
	}
	public void setNomEvenement(String nomEvenement) {
		this.nomEvenement = nomEvenement;
	}
	public String getTypeEvenement() {
		return typeEvenement;
	}
	public void setTypeEvenement(String typeEvenement) {
		this.typeEvenement = typeEvenement;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getGroupe() {
		return groupe;
	}
	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}
	public String getDateEvenement() {
		return dateEvenement;
	}
	public void setDateEvenement(String dateEvenement) {
		this.dateEvenement = dateEvenement;
	}
	public String getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}
	public String getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(String heureFin) {
		this.heureFin = heureFin;
	}
	public Evenement(Integer id, String nomEvenement, String typeEvenement, String year, String groupe,
			String dateEvenement, String heureDebut, String heureFin) {
		super();
		this.id = id;
		this.nomEvenement = nomEvenement;
		this.typeEvenement = typeEvenement;
		this.year = year;
		this.groupe = groupe;
		this.dateEvenement = dateEvenement;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
	}
	public Evenement() {
		super();
		// TODO Auto-generated constructor stub
	}  
	
	
	
}