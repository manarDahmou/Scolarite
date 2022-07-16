package com.evotixit.GestionDossiers.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Groupe")

public class Groupe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Groupe_ID")
	private Integer id;

	@Column
	private String groupe;
	
	@Column
	private String niveau;
	@Column
	private String nomEtablissement;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGroupe() {
		return groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}



	

	public String getNomEtablissement() {
		return nomEtablissement;
	}

	public void setNomEtablissement(String nomEtablissement) {
		this.nomEtablissement = nomEtablissement;
	}

	
	public Groupe(Integer id, String groupe, String niveau, String nomEtablissement) {
		super();
		this.id = id;
		this.groupe = groupe;
		this.niveau = niveau;
		this.nomEtablissement = nomEtablissement;
	}

	public Groupe() {    
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
