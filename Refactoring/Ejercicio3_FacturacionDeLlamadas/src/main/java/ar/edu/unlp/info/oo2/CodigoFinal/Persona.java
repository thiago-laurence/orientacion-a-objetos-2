package ar.edu.unlp.info.oo2.CodigoFinal;

import java.util.List;
import java.util.ArrayList;

public abstract class Persona {
	private String nombreYApellido;
	private String telefono;
	private List<Llamada> llamadas;
	protected String identificador;
	private double descuento;
	
	public Persona(String nombreYApellido, String identificador) {
		this.nombreYApellido = nombreYApellido;
		this.identificador = identificador;
		this.llamadas = new ArrayList<Llamada>();
	}
	
	public List<Llamada> getLlamadas() {
		return (this.llamadas);
	}
	
	public void setLlamadas(List<Llamada> llamadas) {
		this.llamadas = llamadas;
	}
	
	public String getNombreYAPellido() {
		return (this.nombreYApellido);
	}
	
	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}
	
	public String getTelefono() {
		return (this.telefono);
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	public double getDescuento() {
		return (this.descuento);
	}
	
	public Llamada hacerLlamadaInternacional(Persona receptor, int duracion) {
		Llamada llamada = new LlamadaInternacional(this.getTelefono(), receptor.getTelefono(), duracion);
		this.getLlamadas().add(llamada);
		return (llamada);
	}
	
	public Llamada hacerLlamadaNacional(Persona receptor, int duracion) {
		Llamada llamada = new LlamadaNacional(this.getTelefono(), receptor.getTelefono(), duracion);
		this.getLlamadas().add(llamada);
		return (llamada);
	}
	
	public double calcularCostosDeLlamadas() {
		return (this.getLlamadas().stream()
				.mapToDouble(llamada -> {
                    double monto = llamada.calcularCosto();
                    return monto - monto * this.getDescuento();
                }).reduce(0, Double::sum)
                );
	}
}
