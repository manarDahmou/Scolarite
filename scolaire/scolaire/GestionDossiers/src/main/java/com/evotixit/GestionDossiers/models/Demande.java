package com.evotixit.GestionDossiers.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Demande")
public class Demande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Demande_ID")
	private Integer id;

	@Column
	private String parentName;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String year;
	
	@Column
	private String dateNaissance;
	@Column
	private String niveau;
	
	@Column
	private String emailParent;
	@Column
	private String etablissementScolaire;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
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

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Demande(Integer id, String parentName, String firstName, String lastName, String year,
			String dateNaissance) {
		super();
		this.id = id;
		this.parentName = parentName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
		this.dateNaissance = dateNaissance;
	}

	public Demande() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Demande [id=" + id + ", parentName=" + parentName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", year=" + year + ", dateNaissance=" + dateNaissance + ", getId()=" + getId()
				+ ", getParentName()=" + getParentName() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getYear()=" + getYear() + ", getDateNaissance()=" + getDateNaissance()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getEmailParent() {
		return emailParent;
	}

	public void setEmailParent(String emailParent) {
		this.emailParent = emailParent;
	}

	public Demande(String niveau, String emailParent) {
		super();
		this.niveau = niveau;
		this.emailParent = emailParent;
	}

	public String getEtablissementScolaire() {
		return etablissementScolaire;
	}

	public void setEtablissementScolaire(String etablissementScolaire) {
		this.etablissementScolaire = etablissementScolaire;
	}

	
	
	

}
