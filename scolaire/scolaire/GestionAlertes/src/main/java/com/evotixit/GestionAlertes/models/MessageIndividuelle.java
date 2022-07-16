package com.evotixit.GestionAlertes.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MessageIndividuelle")
public class MessageIndividuelle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MessageIndividuelle_ID")
	private Integer id;
	
	@Column
	private String groupe;
	
	@Column
	private String role;
	@Column
	private String parentName;
	@Column
	private String lastName;
	@Column
	private String nomEnseignant;
	
	@Column
	private String niveau;
	@Column
	private String message;
	@Column
	private String type;
	
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getNomEnseignant() {
		return nomEnseignant;
	}
	public void setNomEnseignant(String nomEnseignant) {
		this.nomEnseignant = nomEnseignant;
	}
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	public MessageIndividuelle(Integer id, String groupe, String role, String parentName, String lastName,
			String nomEnseignant, String niveau, String message, String type) {
		super();
		this.id = id;
		this.groupe = groupe;
		this.role = role;
		this.parentName = parentName;
		this.lastName = lastName;
		this.nomEnseignant = nomEnseignant;
		this.niveau = niveau;
		this.message = message;
		this.type = type;
	}
	public MessageIndividuelle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}