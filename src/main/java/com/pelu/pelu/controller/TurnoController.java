package com.pelu.pelu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pelu.pelu.modelo.entity.Peluquero;
import com.pelu.pelu.modelo.entity.Turno;
import com.pelu.pelu.service.TurnoService;

@RestController
@RequestMapping("/turno")
public class TurnoController {
	
	@Autowired
	private TurnoService turnoService;
	
	
	@RequestMapping(value = "/agendar", method= RequestMethod.POST, produces = "application/json")	
	public ResponseEntity agendarTurno(@RequestBody Turno turno){		
		turnoService.guardarTurno(turno);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/peluquero" , method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Turno>> listarTurnosPorPeluquero(@RequestBody Peluquero peluquero){
		
		List<Turno> turnosPeluquero = turnoService.findByPeluquero(peluquero);
		return new ResponseEntity<>(turnosPeluquero,HttpStatus.OK);
	}
}
