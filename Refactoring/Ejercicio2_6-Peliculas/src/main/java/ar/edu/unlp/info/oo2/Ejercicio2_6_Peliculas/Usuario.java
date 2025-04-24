package ar.edu.unlp.info.oo2.Ejercicio2_6_Peliculas;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private int telefono;
	private Subscripcion subs;
	private String email;
	private List<Pelicula> peliculasCompradas;
	
	public Usuario(Subscripcion subs) {
		this.subs = subs;
		this.peliculasCompradas = new ArrayList<Pelicula>();
	}
	
	public void setSubscripcion(Subscripcion subs) {
		this.subs = subs;
	}
	
	public double calcularCostoPelicula(Pelicula p) {
		return (
				this.subs.calcularCosto(p)
				);
	}
}
