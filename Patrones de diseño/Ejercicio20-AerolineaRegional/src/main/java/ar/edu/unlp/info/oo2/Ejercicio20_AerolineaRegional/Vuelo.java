package ar.edu.unlp.info.oo2.Ejercicio20_AerolineaRegional;

public class Vuelo {
	private String nombre;
	private String frecuencia;
	private String salida;
	private String arribo;
	private double costoBase;
	
	public Vuelo(String nombre, String frecuencia, String salida, String arribo, double costoBase) {
		this.nombre = nombre;
		this.frecuencia = frecuencia;
		this.salida = salida;
		this.arribo = arribo;
		this.costoBase = costoBase;
	}
}
