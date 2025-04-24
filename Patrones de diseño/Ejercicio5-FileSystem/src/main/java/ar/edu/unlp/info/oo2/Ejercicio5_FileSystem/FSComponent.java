package ar.edu.unlp.info.oo2.Ejercicio5_FileSystem;

import java.time.LocalDate;

public abstract class FSComponent {
	private String nombre;
	private LocalDate fechaCreacion;
	private int tamano;
	
	public FSComponent(String nombre, LocalDate fechaCreacion, int tamano) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.tamano = tamano;
	}
	
	public abstract int tamanoTotalOcupado();
	public abstract Archivo archivoMasNuevo();
	public abstract Archivo archivoMasGrande();
	
	public String getNombre() {
		return (this.nombre);
	}
	
	public LocalDate getFechaCreacion() {
		return (this.fechaCreacion);
	}
	
	public int getTamano() {
		return (this.tamano);
	}
}
