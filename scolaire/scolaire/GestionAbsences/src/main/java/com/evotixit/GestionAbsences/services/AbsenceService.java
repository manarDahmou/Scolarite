package com.evotixit.GestionAbsences.services;

import java.util.List;

import com.evotixit.GestionAbsences.models.Absence;
import com.evotixit.GestionAbsences.models.AbsencePrevue;

public interface AbsenceService {

	public AbsencePrevue addAbsencePrevue(AbsencePrevue absence) ;
	public Absence addAbsence(Absence absence) ;
	public List<Absence> getAbsenceByCode(Integer code) ;
}
