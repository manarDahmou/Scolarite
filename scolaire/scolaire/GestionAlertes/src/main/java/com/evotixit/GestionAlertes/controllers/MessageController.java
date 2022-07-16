package com.evotixit.GestionAlertes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evotixit.GestionAlertes.models.MessageGroupe;
import com.evotixit.GestionAlertes.models.MessageIndividuelle;
import com.evotixit.GestionAlertes.services.MessageService;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api/alertes")
public class MessageController {
	@Autowired
	private MessageService messageService;

	@PostMapping("/addMessageGroupe")
	public MessageGroupe addMessageGroupe(@RequestBody MessageGroupe message) {
		
		return messageService.addMessageGroupe(message);

	}
	
	@PostMapping("/addMessageIndividuelle")
	public MessageIndividuelle addMessageIndividuelle(@RequestBody MessageIndividuelle message) {
		
		return messageService.addMessageIndividuelle(message);

	}
	@PostMapping("/addMessageParent")
	public MessageIndividuelle addMessageParent(@RequestBody MessageIndividuelle message) {
		
		return messageService.addMessageParent(message);

	}
	@PostMapping("/addReclamation")
	public MessageIndividuelle addReclamation(@RequestBody MessageIndividuelle message) {
		
		return messageService.addReclamation(message);

	}
	
	@GetMapping("getMessageGroupe/{groupe}")
	List<MessageGroupe> getMessageGroupe(@PathVariable String groupe) {
		return messageService.getMessageGroupe(groupe);
	}
	@GetMapping("getMessageIndividuelle/{groupe}")
	List<MessageIndividuelle> getMessageIndividuelle(@PathVariable String groupe) {
		return messageService.getMessageIndividuelle(groupe);
	}
	@GetMapping("getReclamation/{type}")
	List<MessageIndividuelle> getReclamation(@PathVariable String type) {
		return messageService.getReclamations(type);
	}
	@GetMapping("getMessageParent/{nom}")
	List<MessageIndividuelle> getMessageParent(@PathVariable String nom) {
		return messageService.getMessageParent(nom);
	}

}
