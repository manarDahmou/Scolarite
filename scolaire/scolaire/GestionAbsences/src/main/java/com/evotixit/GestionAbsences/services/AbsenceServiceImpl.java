package com.evotixit.GestionAbsences.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evotixit.GestionAbsences.models.Absence;
import com.evotixit.GestionAbsences.models.AbsencePrevue;
import com.evotixit.GestionAbsences.repository.AbsencePrevueRepository;
import com.evotixit.GestionAbsences.repository.AbsenceRepository;

@Service
@Transactional
public class AbsenceServiceImpl implements AbsenceService {

	@Autowired
	private AbsenceRepository absenceRepository;
	@Autowired
	private AbsencePrevueRepository absencePrevueRepository;
	
	
	@Override
	public AbsencePrevue addAbsencePrevue(AbsencePrevue absence) {

		return absencePrevueRepository.save(absence);
	}
	@Override
	public Absence addAbsence(Absence absence) {

		return absenceRepository.save(absence);
	}
	@Override
	public List<Absence> getAbsenceByCode(Integer code) {

			return absenceRepository.findByCode(code);		
	}

}
