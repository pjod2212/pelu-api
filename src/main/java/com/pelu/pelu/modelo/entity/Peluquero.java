package com.pelu.pelu.modelo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "peluquero")
public class Peluquero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_peluquero")
	private long idPeluquero;
	
	@Column(name = "nombre_apellido")
	private String nombreApellido;
	
	@Column(name = "email")
	private String email;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PELUQUERIA_ID", nullable = false, updatable = false)
	private Peluqueria peluqueria;
	
	@OneToMany(cascade = CascadeType.ALL ,mappedBy = "peluquero",fetch = FetchType.LAZY)
	private List<Turno> turno;
	
//	@ManyToMany(mappedBy = "peluqueros")
//	private List<Servicio> servicios;

	public long getIdPeluquero() {
		return idPeluquero;
	}

	public void setIdPeluquero(long idPeluquero) {
		this.idPeluquero = idPeluquero;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@JsonBackReference
	public Peluqueria getPeluqueria() {
		return peluqueria;
	}

	public void setPeluqueria(Peluqueria peluqueria) {
		this.peluqueria = peluqueria;
	}
	
//	@JsonManagedReference
//	public List<Servicio> getServicios() {
//		return servicios;
//	}
//
//	public void setServicios(List<Servicio> servicios) {
//		this.servicios = servicios;
//	}
	
	@JsonManagedReference(value="peluquero-turno")
	public List<Turno> getTurno() {
		return turno;
	}

	public void setTurno(List<Turno> turno) {
		this.turno = turno;
	}	
	
	
		
}
