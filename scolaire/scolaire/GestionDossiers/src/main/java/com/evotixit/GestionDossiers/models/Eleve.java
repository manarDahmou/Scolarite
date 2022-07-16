package com.evotixit.GestionDossiers.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "Eleve")
	public class Eleve {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "Eleve_ID")
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
		private String groupe;
		
		@Column
		private String emailParent;
		
		@Column
		private Integer codePermanent;
		@Column
		private String etablissementScolaire;

		@Column
		private boolean etatEtablissement;
		
		@Column
		private String niveau;
		
	

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

		public String getEtablissementScolaire() {
			return etablissementScolaire;
		}

		public void setEtablissementScolaire(String etablissementScolaire) {
			this.etablissementScolaire = etablissementScolaire;
		}

		public boolean isEtatEtablissement() {
			return etatEtablissement;
		}

		public void setEtatEtablissement(boolean etatEtablissement) {
			this.etatEtablissement = etatEtablissement;
		}

		public String getNiveau() {
			return niveau;
		}

		public void setNiveau(String niveau) {
			this.niveau = niveau;
		}

	
		
		
		public Eleve(Integer id, String parentName, String firstName, String lastName, String year,
				String dateNaissance, String groupe, String emailParent, Integer codePermanent,
				String etablissementScolaire, boolean etatEtablissement, String niveau) {
			super();
			this.id = id;
			this.parentName = parentName;
			this.firstName = firstName;
			this.lastName = lastName;
			this.year = year;
			this.dateNaissance = dateNaissance;
			this.groupe = groupe;
			this.emailParent = emailParent;
			this.codePermanent = codePermanent;
			this.etablissementScolaire = etablissementScolaire;
			this.etatEtablissement = etatEtablissement;
			this.niveau = niveau;
		}

		public Eleve() {
			super();
			// TODO Auto-generated constructor stub
		}

	
		
		  

}
