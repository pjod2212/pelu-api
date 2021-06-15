package com.pelu.pelu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pelu.pelu.modelo.entity.Peluqueria;
import com.pelu.pelu.modelo.entity.Peluquero;
import com.pelu.pelu.modelo.entity.Servicio;
import com.pelu.pelu.repository.ServicioRepository;
import com.pelu.pelu.service.PeluqueriaService;
import com.pelu.pelu.service.PeluqueroService;
import com.pelu.pelu.service.ServicioService;

@RestController
@RequestMapping("/peluquero")
public class ServicioController {

	@Autowired
	private ServicioService servicioService;
	
	@RequestMapping(value = "/servicios", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Servicio>> devolverPeluquero(){
		return new ResponseEntity<>(servicioService.listarServicios(),HttpStatus.OK);
	}
	
	
}
