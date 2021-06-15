package com.pelu.pelu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pelu.pelu.modelo.entity.Peluquero;
import com.pelu.pelu.modelo.entity.Turno;
import com.pelu.pelu.repository.TurnoRepository;

@Service
@Transactional
public class TurnoService {

	@Autowired
	private TurnoRepository turnoRepository;
	
	public void guardarTurno(Turno turno) {
		turnoRepository.save(turno);
	}
	
	public List<Turno> findByPeluquero(Peluquero peluquero){
		return turnoRepository.findByPeluquero(peluquero);
	}
	
}
