package ar.edu.unlp.info.oo2.Ejercicio10_AdministradorDeProyectos;

import java.time.LocalDate;
import java.time.Period;

public class Proyecto {
	private StateProyect estadoActual;
	private LocalDate inicio, fin;
	private String nombre, objetivo;
	private int nroIntegrantes;
	private double costoXdia, margenGanancia;
	
	public Proyecto(String nombre, String objetivo, int nroIntegrantes, LocalDate inicio, LocalDate fin, double costoXdia) {
		this.costoXdia = costoXdia;
		this.nombre = nombre;
		this.objetivo = objetivo;
		this.inicio = inicio;
		this.fin = fin;
		this.nroIntegrantes = nroIntegrantes;
		this.margenGanancia = 0.07;
		this.estadoActual = new EnConstruccion(this);
	}
	
	public void aprobarEtapa() {
		this.estadoActual.aprobarEtapa();
	}
	
	protected void setState(StateProyect nuevoEstado) {
		this.estadoActual = nuevoEstado;
	}
	
	protected void setMargenDeGanancia(double nuevoMargen) {
		this.margenGanancia = nuevoMargen;
	}
	protected double getMargenDeGanancia() {
		return (this.margenGanancia);
	}
	
	public double precioDelProyecto() {
		return (this.costoDelProyecto() * this.margenGanancia);
	}
	
	public double costoDelProyecto() {
		return (
					this.nroIntegrantes * this.costoXdia * Period.between(inicio, fin).getDays()
				);
	}
	
	public void cancelarProyecto() {
		this.objetivo = "Cancelado";
	}
	
	public void modificarMargenDeGanancia(double nuevoMargen) {
		this.estadoActual.modificarMargenDeGanancia(nuevoMargen);
	}
}
