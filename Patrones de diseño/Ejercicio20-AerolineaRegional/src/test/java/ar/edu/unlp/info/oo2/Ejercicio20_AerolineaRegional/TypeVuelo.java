package ar.edu.unlp.info.oo2.Ejercicio20_AerolineaRegional;

import java.time.LocalDate;
import java.util.List;

public class TypeVuelo {
	private LocalDate horaSalida;
	private LocalDate horaLlegada;
	private List<String> itinerario;
	private String origen;
	private String destino;
	
	public TypeVuelo(LocalDate horaSalida, LocalDate horaLlegada, List<String> itinerario, String origen,
			String destino) {
		super();
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.itinerario = itinerario;
		this.origen = origen;
		this.destino = destino;
	}
	
	public LocalDate getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(LocalDate horaSalida) {
		this.horaSalida = horaSalida;
	}
	public LocalDate getHoraLlegada() {
		return horaLlegada;
	}
	public void setHoraLlegada(LocalDate horaLlegada) {
		this.horaLlegada = horaLlegada;
	}
	public List<String> getItinerario() {
		return itinerario;
	}
	public void setItinerario(List<String> itinerario) {
		this.itinerario = itinerario;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
}
