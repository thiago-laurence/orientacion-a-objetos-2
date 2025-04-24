package ar.edu.unlp.info.oo2.Ejercicio20_AerolineaRegional;

import java.time.LocalDate;
import java.util.List;

public class Pasaje {
	private Pasajero pasajero;
	private LocalDate fecha;
	private CuadroTarifario tarifa;
	private List<Tramo> tramos;
	
	public Pasaje(Pasajero pasajero, List<Tramo> tramos, LocalDate fecha, CuadroTarifario tarifa) {
		this.pasajero = pasajero;
		this.fecha = fecha;
		this.tarifa = tarifa;
		this.tramos = tramos;
	}
	
	public LocalDate getFecha() {
		return (this.fecha);
	}
}
