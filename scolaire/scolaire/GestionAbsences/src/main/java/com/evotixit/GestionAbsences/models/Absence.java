package com.evotixit.GestionAbsences.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Absence")
public class Absence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Absence_ID")
	private Integer id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String year;
	
	@Column
	private String dateAbsence;
	
	@Column
	private String groupe;
	
	
	@Column
	private Integer codePermanent;
	
	
	
	
	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
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




	public String getDateAbsence() {
		return dateAbsence;
	}




	public void setDateAbsence(String dateAbsence) {
		this.dateAbsence = dateAbsence;
	}




	public String getGroupe() {
		return groupe;
	}




	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}




	public Integer getCodePermanent() {
		return codePermanent;
	}




	public void setCodePermanent(Integer codePermanent) {
		this.codePermanent = codePermanent;
	}




	public Absence(Integer id, String firstName, String lastName, String year, String dateAbsence, String groupe,
			Integer codePermanent) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
		this.dateAbsence = dateAbsence;
		this.groupe = groupe;
		this.codePermanent = codePermanent;
	}




	public Absence() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
}
