package ar.edu.unlp.info.oo2.Ejercicio14_FileManager;

import java.time.LocalDate;

public class FileOO2 implements File{
	private String nombre, permisos, extension;
	private LocalDate fechaModificacion, fechaCreacion;
	private int tamano;
	
	public FileOO2(String nombre, String permisos, String extension, int tamano, LocalDate fechaCreacion, LocalDate fechaModificacion) {
		this.nombre = nombre;
		this.extension = extension;
		this.permisos = permisos;
		this.tamano = tamano;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
	}

	@Override
	public String prettyPrint() {
		return ("");
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String getPermisos() {
		return permisos;
	}

	@Override
	public String getExtension() {
		return extension;
	}

	@Override
	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}
	
	@Override
	public int getTamano() {
		return (this.tamano);
	}

	@Override
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
}
