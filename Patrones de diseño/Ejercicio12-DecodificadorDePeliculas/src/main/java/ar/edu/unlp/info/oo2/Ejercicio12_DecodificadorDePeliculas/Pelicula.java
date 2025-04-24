package ar.edu.unlp.info.oo2.Ejercicio12_DecodificadorDePeliculas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pelicula {
	private String titulo;
	private int anioEstreno;
	private double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula(String titulo, double puntaje, int anioEstreno) {
		this.titulo = titulo;
		this.anioEstreno = anioEstreno;
		this.puntaje = puntaje;
		this.similares = new ArrayList<Pelicula>();
	}
	
	public void setSimilar(Pelicula similar) {
		if (!this.similares.contains(similar)) {
			this.similares.add(similar);
			similar.setSimilar(this);
		}
	}
	
	public int getEstreno() {
		return (this.anioEstreno);
	}
	
	public double getPuntaje() {
		return (this.puntaje);
	}
	
	public String getTitulo() {
		return (this.titulo);
	}
	
	public List<Pelicula> getSimilares(){
		return (this.similares.stream().collect(Collectors.toList()));
	}
	
	public String toString() {
		StringBuilder stb = new StringBuilder(this.getTitulo() + ", " + this.getPuntaje() + ", " + this.getEstreno());
		if (this.similares.size() != 0) {
			stb.append(" (Similar a ");
			this.getSimilares().forEach(p -> stb.append(p.getTitulo() + ", "));
			stb.delete(stb.length() -2, stb.length());
			stb.append(")");
		}
		return (stb.toString());
	}
}
