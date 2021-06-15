package com.pelu.pelu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pelu.pelu.modelo.entity.Peluqueria;
import com.pelu.pelu.modelo.entity.Peluquero;
import com.pelu.pelu.repository.PeluqueriaRepository;
import com.pelu.pelu.repository.PeluqueroRepository;
@Service
@Transactional
public class PeluqueroService {

	@Autowired
	private PeluqueroRepository peluqueroService;
	
		
	public Optional<Peluquero> devolverPeluqueroPorId(long idPeluquero) {		
		return peluqueroService.findById(idPeluquero);		
	}
	
	public List<Peluquero> listarPeluqueros(){
		return peluqueroService.findAll();
	}
	
}
