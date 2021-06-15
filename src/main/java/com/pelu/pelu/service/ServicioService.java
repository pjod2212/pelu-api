package com.pelu.pelu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pelu.pelu.modelo.entity.Peluqueria;
import com.pelu.pelu.modelo.entity.Peluquero;
import com.pelu.pelu.modelo.entity.Servicio;
import com.pelu.pelu.repository.PeluqueriaRepository;
import com.pelu.pelu.repository.PeluqueroRepository;
import com.pelu.pelu.repository.ServicioRepository;
@Service
@Transactional
public class ServicioService {

	@Autowired
	private ServicioRepository servicioRepository;
	
		
	public List<Servicio> listarServicios(){
		return servicioRepository.findAll();
	}
	
}
