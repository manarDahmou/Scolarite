package com.evotixit.GestionDossiers.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Niveau")
public class Niveau {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Niveau_ID")
	private Integer id;

	@Column
	private String niveau;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public Niveau(Integer id, String niveau) {
		super();
		this.id = id;
		this.niveau = niveau;
	}

	public Niveau() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Niveau [id=" + id + ", niveau=" + niveau + ", getId()=" + getId() + ", getNiveau()=" + getNiveau()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


}
