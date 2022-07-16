
package com.evotixit.GestionAbsences.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Absence_prevue")
public class AbsencePrevue {
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
	private String emailParent;
	
	@Column
	private Integer codePermanent;
	@Column
	private String description;
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
	public String getEmailParent() {
		return emailParent;
	}
	public void setEmailParent(String emailParent) {
		this.emailParent = emailParent;
	}
	public Integer getCodePermanent() {
		return codePermanent;
	}
	public void setCodePermanent(Integer codePermanent) {
		this.codePermanent = codePermanent;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public AbsencePrevue(Integer id, String firstName, String lastName, String year, String dateAbsence, String groupe,
			String emailParent, Integer codePermanent, String description) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
		this.dateAbsence = dateAbsence;
		this.groupe = groupe;
		this.emailParent = emailParent;
		this.codePermanent = codePermanent;
		this.description = description;
	}
	public AbsencePrevue() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
}
