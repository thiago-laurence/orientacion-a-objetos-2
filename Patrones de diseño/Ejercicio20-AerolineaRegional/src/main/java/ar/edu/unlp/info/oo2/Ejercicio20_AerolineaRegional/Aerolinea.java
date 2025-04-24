package ar.edu.unlp.info.oo2.Ejercicio20_AerolineaRegional;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Aerolinea {
	private CuadroTarifario cuadroTarifario;
	private List<String> aeropuertos;
	private List<Vuelo> vuelos;
	private List<Servicio> servicios;
	private List<Pasaje> pasajes;
	
	@SuppressWarnings("serial")
	public Aerolinea() {
		this.cuadroTarifario = new CuadroTarifario(new double[]{ 1, 1.01, 0.99, 0.95, 1, 1.01, 1.01 }, 0.95, 0.93);
		this.vuelos = new ArrayList<Vuelo>() {{ 
			add(new Vuelo("UF101", "Diario", "La plata 07:00 AM", "Balcarce 08:00 AM", 12000));
			add(new Vuelo("UF102", "Diario", "Balcarce 09:00 AM", "Pergamino 10:30 AM", 15000));
			add(new Vuelo("UF201", "Diario", "La plata 02:00 PM", "Pergamino 03:15 PM", 14000));
			add(new Vuelo("UF202", "Diario", "Pergamino 05:00 PM", "Balcarce 06:30 PM", 15000));
			add(new Vuelo("UF203", "Diario", "Balcarce 08:00 PM", "La plata 09:00 PM", 12000));
		}};
		this.aeropuertos = new ArrayList<String>() {{
			add("La plataa");
			add("Balcarce");
			add("Pergamino");
			
		}};
		this.servicios = new ArrayList<Servicio>();
		this.pasajes= new ArrayList<Pasaje>();
	}
	
	public Pasaje venderPasaje(Pasajero unPasajero, List<Tramo> tramos, LocalDate fecha, CuadroTarifario tarifa) {
		Pasaje p = new Pasaje(unPasajero, tramos, fecha, tarifa);
		this.pasajes.add(p);
		return (p);
	}
	
	public Pasaje modificarPasaje(Pasaje unPasaje) {
		return (null);
	}
	
	public void cancelarPasaje(Pasaje unPasaje) {
		this.pasajes.remove(unPasaje);
	}
	
	public String[] promedioDeOcupacion(LocalDate desde, LocalDate hasta) {
		this.pasajes.stream().flatMap(p -> p.getTramosEnPeriodo(desde, hasta).stream());
	}
}
