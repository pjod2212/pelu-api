package com.pelu.pelu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pelu.pelu.modelo.entity.Peluquero;
import com.pelu.pelu.modelo.entity.Turno;

public interface TurnoRepository extends JpaRepository<Turno,Long>{
	List<Turno> findByPeluquero(Peluquero peluquero);

}
