package ar.edu.unlp.info.oo2.Ejercicio5_FileSystem;

import java.time.LocalDate;

public class Archivo extends FSComponent{
	
	public Archivo(String nombre, LocalDate fechaCreacion, int tamano) {
		super(nombre, fechaCreacion, tamano);
	}

	@Override
	public int tamanoTotalOcupado() {
		return (this.getTamano());
	}

	@Override
	public Archivo archivoMasNuevo() {
		return (this);
	}

	@Override
	public Archivo archivoMasGrande() {
		return (this);
	}
}
