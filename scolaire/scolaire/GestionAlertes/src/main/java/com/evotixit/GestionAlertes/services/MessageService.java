package com.evotixit.GestionAlertes.services;

import java.util.List;

import com.evotixit.GestionAlertes.models.MessageGroupe;
import com.evotixit.GestionAlertes.models.MessageIndividuelle;

public interface MessageService {
	public MessageGroupe addMessageGroupe(MessageGroupe message) ;
	public MessageIndividuelle addMessageIndividuelle(MessageIndividuelle message) ;
	public List<MessageGroupe> 	getMessageGroupe(String groupe) ;
	public List<MessageIndividuelle> 	getMessageIndividuelle(String groupe) ;
	public MessageIndividuelle addMessageParent(MessageIndividuelle message) ;
	public MessageIndividuelle addReclamation(MessageIndividuelle message) ;
	public List<MessageIndividuelle> 	getReclamations(String type) ;
	public List<MessageIndividuelle> getMessageParent(String nom) ;
}
