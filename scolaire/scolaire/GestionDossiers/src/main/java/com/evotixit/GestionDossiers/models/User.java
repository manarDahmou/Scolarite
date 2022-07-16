/*package com.evotixit.GestionDossiers.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User  implements Serializable{

	@Id
	private int id;
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
	private List<Eleve> dossierEleve = new ArrayList<>()  ;
	

}*/