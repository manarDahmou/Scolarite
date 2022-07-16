package com.evotixit.GestionResultats.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Bulletin")
public class Bulletin {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	
	
	@Column
	private String coefficient;
	
	@Column
	private String groupe;
	
	@Column
	private String firstName;

	@Column
	private String lastName;
	
	@Column
	private Integer codePermanent;
	
	@Column
	private String moyenne;
	
	@Column
	private String etablissementScolaire;
	
	@Column
	private String niveau;


	@Column
	private String year;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	

	public String getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(String coefficient) {
		this.coefficient = coefficient;
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



	public String getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(String moyenne) {
		this.moyenne = moyenne;
	}

	@Override
	public String toString() {
		return "Resultat [id=" + id + ", nomMatiere="  + ", noteMatiere=" +  ", coefficient="
				+ coefficient + ", groupe=" + groupe + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", codePermanent=" + codePermanent + ", moyenne=" + moyenne + ", etablissementScolaire="
				+ etablissementScolaire + ", niveau=" + niveau + ", year=" + year + "]";
	}

	

	public Bulletin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bulletin(Integer id ,String coefficient, String groupe,
			String firstName, String lastName, Integer codePermanent, String moyenne, String etablissementScolaire,
			String niveau, String year) {
		super();
		this.id = id;
	
		this.coefficient = coefficient;
		this.groupe = groupe;
		this.firstName = firstName;
		this.lastName = lastName;
		this.codePermanent = codePermanent;
		this.moyenne = moyenne;
		this.etablissementScolaire = etablissementScolaire;
		this.niveau = niveau;
		this.year = year;
	}
	
	
	
}

