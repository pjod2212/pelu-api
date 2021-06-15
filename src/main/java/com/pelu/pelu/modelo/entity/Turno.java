package com.pelu.pelu.modelo.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "turno")
public class Turno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_turno",insertable = false)
	private long idTurno;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente", nullable = false, updatable = false)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "id_peluquero", nullable = false, updatable = false)
	private Peluquero peluquero;

	@ManyToOne
	@JoinColumn(name = "id_servicio", nullable = false, updatable = false)
	private Servicio servicio;	
	
	@Column(name = "fecha_hora_inicio")
	private Date fechaHoraInicio;
	
	@Column(name = "fecha_hora_fin")
	private Date fechaHoraFin;
		
	public long getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(long idTurno) {
		this.idTurno = idTurno;
	}
	
	@JsonBackReference(value="cliente-turno")
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@JsonBackReference(value="peluquero-turno") 
	public Peluquero getPeluquero() {
		return peluquero;
	}

	public void setPeluquero(Peluquero peluquero) {
		this.peluquero = peluquero;
	}

	public Date getFechaHoraInicio() {
		return fechaHoraInicio;
	}

	public void setFechaHoraInicio(Date fechaHoraInicio) {
		this.fechaHoraInicio = fechaHoraInicio;
	}

	public Date getFechaHoraFin() {
		return fechaHoraFin;
	}

	public void setFechaHoraFin(Date fechaHoraFin) {
		this.fechaHoraFin = fechaHoraFin;
	}	
	
	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}		

}
