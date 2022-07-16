package com.evotixit.GestionAcces.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "Etablissement")
public class Etablissement { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Etablissement_ID")
	private Integer id;

	@Column
	private String nomEtablissement;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomEtablissement() {
		return nomEtablissement;
	}

	public void setNomEtablissement(String nomEtablissement) {
		this.nomEtablissement = nomEtablissement;
	}

	

	public Etablissement(Integer id, String nomEtablissement) {
		super();
		this.id = id;
		this.nomEtablissement = nomEtablissement;
	}

	public Etablissement() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Etablissement [id=" + id + ", nomEtablissement=" + nomEtablissement + ", getId()=" + getId()
				+ ", getNomEtablissement()=" + getNomEtablissement() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
