package com.pelu.pelu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pelu.pelu.modelo.entity.Peluqueria;
import com.pelu.pelu.service.PeluqueriaService;


@RestController
@RequestMapping("/peluqueria")
public class PeluqueriaController {

	@Autowired
	private PeluqueriaService peluqueriaService;
		
	@RequestMapping(value = "/peluquerias", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Peluqueria>> listarPeluquerias(){
		return new ResponseEntity<>(peluqueriaService.listarPeluquerias(),HttpStatus.OK);
	}
		
	
}
