package com.evotixit.GestionAlertes.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MessageGroupe")
public class MessageGroupe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MessageGPR_ID")
	private Integer id;
	
	@Column
	private String groupe;
	@Column
	private String role;
	@Column
	private String nomEnseignant;
	@Column
	private String nomParent;
	@Column
	private String nomMatiere;
	@Column
	private String coefficient;
	@Column
	private String message;
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
	public String getNomEnseignant() {
		return nomEnseignant;
	}
	public void setNomEnseignant(String nomEnseignant) {
		this.nomEnseignant = nomEnseignant;
	}
	public String getNomMatiere() {
		return nomMatiere;
	}
	public void setNomMatiere(String nomMatiere) {
		this.nomMatiere = nomMatiere;
	}
	public String getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(String coefficient) {
		this.coefficient = coefficient;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getNomParent() {
		return nomParent;
	}
	public void setNomParent(String nomParent) {
		this.nomParent = nomParent;
	}

	public MessageGroupe(Integer id, String groupe, String role, String nomEnseignant, String nomParent,
			String nomMatiere, String coefficient, String message) {
		super();
		this.id = id;
		this.groupe = groupe;
		this.role = role;
		this.nomEnseignant = nomEnseignant;
		this.nomParent = nomParent;
		this.nomMatiere = nomMatiere;
		this.coefficient = coefficient;
		this.message = message;
	}
	public MessageGroupe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
