package com.evotixit.GestionResultats.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Matiere")
public class Matiere {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Matiere_ID")
	private Integer id;

	@Column
	private String nomMatiere;

	@Column
	private String niveau;
	
	@Column
	private Integer coefficient;
	
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



	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public Integer getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(Integer coefficient) {
		this.coefficient = coefficient;
	}
 


	public Matiere(Integer id, String nomMatiere, String niveau, Integer coefficient) {
		super();
		this.id = id;
		this.nomMatiere = nomMatiere;
		this.niveau = niveau;
		this.coefficient = coefficient;
	}

	public Matiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

	

}
