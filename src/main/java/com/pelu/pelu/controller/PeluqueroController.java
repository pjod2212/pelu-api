package com.pelu.pelu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pelu.pelu.modelo.entity.Peluquero;
import com.pelu.pelu.service.PeluqueroService;

@RestController
@RequestMapping("/peluquero")
public class PeluqueroController {

	@Autowired
	private PeluqueroService peluqueroService;
	
	@RequestMapping(value = "/peluqueros", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Peluquero>> devolverPeluquero(){
		return new ResponseEntity<>(peluqueroService.listarPeluqueros(),HttpStatus.OK);
	}
	
	
}
