package com.pelu.pelu.modelo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "peluqueria")
public class Peluqueria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_peluqueria")
	private long idPeluqueria;
	
	@Column(name = "nombre")
	private String nombre;
	

	@Column(name = "direccion")
	private String direccion;
	

	@Column(name = "cant_max_personas")
	private int cantMaxPersonas;
	
	@OneToMany(cascade = CascadeType.ALL ,mappedBy = "peluqueria",fetch = FetchType.LAZY)	
	List<Peluquero> peluqueroList;

	public long getIdPeluqueria() {
		return idPeluqueria;
	}

	public void setIdPeluqueria(long idPeluqueria) {
		this.idPeluqueria = idPeluqueria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCantMaxPersonas() {
		return cantMaxPersonas;
	}

	public void setCantMaxPersonas(int cantMaxPersonas) {
		this.cantMaxPersonas = cantMaxPersonas;
	}

	@JsonManagedReference
	public List<Peluquero> getPeluqueroList() {
		return peluqueroList;
	}

	public void setPeluqueroList(List<Peluquero> peluqueroList) {
		this.peluqueroList = peluqueroList;
	}
	
	
}
