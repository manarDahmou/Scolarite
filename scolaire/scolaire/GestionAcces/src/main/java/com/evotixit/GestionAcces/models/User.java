package com.evotixit.GestionAcces.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Utilisateur")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_ID")
	private Integer id;

	@Column
	private String username; 
	@Column
	@Enumerated(EnumType.STRING)
	private RoleUser role;

	@Column
	private String tel;

	@Column
	private String cin;

	@Column
	private String email;
	@Column
	private String adresse;
	@Column
	private String dateNaissance;
	@Column
	private String password;
	@Column
	private String emailConfirm;
	
	@Column
	private String nomEtablissement;
	
	@Column
	private boolean emailVerifiée;
	
	@Column
	private boolean etat_Connexion;
	
	
	@Column(name = "reset_password_token")
	private String resetPasswordToken;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "USERS_ROLES", joinColumns = { @JoinColumn(name = "USER_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "ROLE_ID") })
	private List<Role> roles;
	
	//@ManyToMany(fetch = FetchType.EAGER)
//	@JoinTable(name = "Eleve", joinColumns = { @JoinColumn(name = "USER_ID") }, inverseJoinColumns = {
	//		@JoinColumn(name = "Eleve_ID") })
	//private Eleve eleve;
	
	@Column(name = "verification_code", length = 64, updatable = false)
	private String verificationCode;
	@Column
	private boolean enabled;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public RoleUser getRole() {
		return role;
	}

	public void setRole(RoleUser role) {
		this.role = role;
	}

	public void setVerificationCode() {
		this.verificationCode = null;
	}

	public String getEmailConfirm() {
		return emailConfirm;
	}

	public void setEmailConfirm(String emailConfirm) {
		this.emailConfirm = emailConfirm;
	}

	public String getResetPasswordToken() {
		return resetPasswordToken;
	}

	public void setResetPasswordToken(String resetPasswordToken) {
		this.resetPasswordToken = resetPasswordToken;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNomEtablissement() {
		return nomEtablissement;
	}

	public void setNomEtablissement(String nomEtablissement) {
		this.nomEtablissement = nomEtablissement;
	}

	public boolean isEmailVerifiée() {
		return emailVerifiée;
	}

	public void setEmailVerifiée(boolean emailVerifiée) {
		this.emailVerifiée = emailVerifiée;
	}

	public boolean isEtatConnexion() {
		return etat_Connexion;
	}

	public void setEtatConnexion(boolean etat_Connexion) {
		this.etat_Connexion = etat_Connexion;
	}



	
	
 
	
}
