package com.pelu.pelu.modelo.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "servicio")
public class Servicio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_servicio")
	private long idServicio;
	
	@Column(name = "nombre")
	private String nombre;
	

	@Column(name = "precio")
	private String precio;
		
	@JoinTable(
	   name = "rel_servicio_peluquero",
	   joinColumns = @JoinColumn(name = "SERVICIO_ID", nullable = false),
	   inverseJoinColumns = @JoinColumn(name="PELUQUERO_ID", nullable = false)
	)
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Peluquero> peluqueros;
	
//	@OneToMany(cascade = CascadeType.ALL ,mappedBy = "servicio",fetch = FetchType.LAZY)
//	private List<Turno> turno;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public long getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(long idServicio) {
		this.idServicio = idServicio;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	@JsonBackReference
	public List<Peluquero> getPeluqueros() {
		return peluqueros;
	}

	public void setPeluqueros(List<Peluquero> peluqueros) {
		this.peluqueros = peluqueros;
	}		
	
}
