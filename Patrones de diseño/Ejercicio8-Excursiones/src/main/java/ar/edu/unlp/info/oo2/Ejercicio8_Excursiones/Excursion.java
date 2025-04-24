package ar.edu.unlp.info.oo2.Ejercicio8_Excursiones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private String nombre, puntoEncuentro;
	private LocalDate fechaInicio, fechaFin;
	private int cupoMin, cupoMax;
	private double costo;
	private List<Usuario> inscriptos, listaEnEspera;
	private ExcursionState estado;
	
	public Excursion(String nombre, double costo, LocalDate fechaInicio, LocalDate fechaFin, 
			int cupoMin, int cupoMax, String puntoEncuentro) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.costo = costo;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		this.puntoEncuentro = puntoEncuentro;
		this.inscriptos = new ArrayList<Usuario>();
		this.listaEnEspera = new ArrayList<Usuario>();
		this.estado = new Provisoria();
	}
	
	public void inscribir(Usuario unUsuario) {
		this.estado.inscribir(this, unUsuario);
	}
	
	public String obtenerInfo() {
		return (this.estado.obtenerInfo(this));
	}

	protected void changeState(ExcursionState nuevoEstado) {
		this.estado = nuevoEstado;
	}
	
	public String getNombre() {
		return (this.nombre);
	}
	
	public double getCosto() {
		return (this.costo);
	}
	
	public LocalDate getFechaInicio() {
		return (this.fechaInicio);
	}
	
	public LocalDate getFechaFin() {
		return (this.fechaFin);
	}
	
	public String getPuntoEncuentro() {
		return (this.puntoEncuentro);
	}
	
	protected int getCupoMin() {
		return cupoMin;
	}

	protected int getCupoMax() {
		return cupoMax;
	}


	protected List<Usuario> getInscriptos() {
		return inscriptos;
	}

	protected List<Usuario> getListaEnEspera() {
		return listaEnEspera;
	}
}
