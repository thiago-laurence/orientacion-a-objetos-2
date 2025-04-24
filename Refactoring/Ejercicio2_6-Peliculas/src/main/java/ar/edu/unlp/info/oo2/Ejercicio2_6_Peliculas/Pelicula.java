package ar.edu.unlp.info.oo2.Ejercicio2_6_Peliculas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pelicula {
	private String nombre;
	private String genero;
	private double costo;
	private LocalDate fechaEstreno;
	
	public double getCosto() {
		return (this.costo);
	}
	
	public boolean esEstreno() {
		return (
				ChronoUnit.DAYS.between(this.fechaEstreno, LocalDate.now()) > 30
				);
	}
}
