package com.evotixit.GestionAlertes.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evotixit.GestionAlertes.models.MessageGroupe;
import com.evotixit.GestionAlertes.models.MessageIndividuelle;
import com.evotixit.GestionAlertes.repository.MessageGroupeRepository;
import com.evotixit.GestionAlertes.repository.MessageIndividuelleRepository;



@Service
@Transactional
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageGroupeRepository messageGroupeRepository;
	
	@Autowired
	private MessageIndividuelleRepository messageIndividuelleRepository;
	
	
	@Override
	public MessageGroupe addMessageGroupe(MessageGroupe message) {
		return messageGroupeRepository.save(message);
	}
	
	@Override
	public MessageIndividuelle addMessageIndividuelle(MessageIndividuelle message) {
		return messageIndividuelleRepository.save(message);
	}
	@Override
	public MessageIndividuelle addMessageParent(MessageIndividuelle message) {
		return messageIndividuelleRepository.save(message);
	}
	@Override
	public MessageIndividuelle addReclamation(MessageIndividuelle message) {
		return messageIndividuelleRepository.save(message);
	}
	@Override 
	public List<MessageGroupe> 	getMessageGroupe(String groupe) {

		return messageGroupeRepository.getMessageGroupe(groupe);
	}
	@Override 
	public List<MessageIndividuelle> 	getMessageIndividuelle(String groupe) {

		return messageIndividuelleRepository.getMessageIndividuelle(groupe);
	}
	@Override 
	public List<MessageIndividuelle> 	getReclamations(String type) {

		return messageIndividuelleRepository.getReclamationsType(type);
	} 
	@Override 
	public List<MessageIndividuelle> getMessageParent(String nom) {

		return messageIndividuelleRepository.getMessageParent(nom);
	} 
	
}


