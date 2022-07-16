package com.evotixit.GestionAbsences.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evotixit.GestionAbsences.models.Absence;
import com.evotixit.GestionAbsences.models.AbsencePrevue;
import com.evotixit.GestionAbsences.services.AbsenceService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api/absences")
public class AbsenceController {
	@Autowired
	private AbsenceService absenceService;

	

	@PostMapping("/addAbsencePrevue")
	public String addAbsencePrevue(@RequestBody AbsencePrevue absence, HttpServletRequest request){

		absenceService.addAbsencePrevue(absence);

		return "";
	}
	
	@PostMapping("/addAbsence")
	public String addAbsence(@RequestBody Absence absence, HttpServletRequest request){

		absenceService.addAbsence(absence);

		return "";
	}
	
	@GetMapping("/getAbsenceByCode/{code}")
	public List<Absence> getAbsenceByCode(@PathVariable Integer code) {
		return absenceService.getAbsenceByCode(code);
	}
}
