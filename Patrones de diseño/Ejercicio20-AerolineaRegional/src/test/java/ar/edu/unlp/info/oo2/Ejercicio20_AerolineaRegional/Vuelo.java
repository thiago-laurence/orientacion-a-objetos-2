package ar.edu.unlp.info.oo2.Ejercicio20_AerolineaRegional;

import java.time.LocalDate;

public class Vuelo {
	private TypeVuelo vuelo;
	private int nroAsiento;
	private Persona pasajero;
	private LocalDate fecha;
	
	public Vuelo(TypeVuelo vuelo, int nroAsiento, Persona pasajero, LocalDate fecha) {
		this.fecha = fecha;
		this.nroAsiento = nroAsiento;
		this.pasajero = pasajero;
		this.vuelo = vuelo;
	}
}
