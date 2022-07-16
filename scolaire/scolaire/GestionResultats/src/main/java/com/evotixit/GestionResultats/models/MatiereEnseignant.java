

package com.evotixit.GestionResultats.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "MatiereEnseignant")
public class MatiereEnseignant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "_ID")
	private Integer id;

	@Column
	private String nomMatiere;
	
	@Column
	private String nomEnseignant;

	@Column
	private String niveau;
	
	@Column
	private Integer coefficient;
	
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

	public String getNomEnseignant() {
		return nomEnseignant;
	}

	public void setNomEnseignant(String nomEnseignant) {
		this.nomEnseignant = nomEnseignant;
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

	public String getGroupe() {
		return groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}

	public MatiereEnseignant(Integer id, String nomMatiere, String nomEnseignant, String niveau, Integer coefficient,
			String groupe) {
		super();
		this.id = id;
		this.nomMatiere = nomMatiere;
		this.nomEnseignant = nomEnseignant;
		this.niveau = niveau;
		this.coefficient = coefficient;
		this.groupe = groupe;
	}

	public MatiereEnseignant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	



	 

	

	

}
