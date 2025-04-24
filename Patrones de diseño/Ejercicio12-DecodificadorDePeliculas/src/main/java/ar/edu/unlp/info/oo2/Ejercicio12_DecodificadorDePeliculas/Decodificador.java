package ar.edu.unlp.info.oo2.Ejercicio12_DecodificadorDePeliculas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Decodificador {
	private List<Pelicula> grilla;
	private List<Pelicula> reproducidas;
	private SugerenciaStrategy sugeridor;
	
	public Decodificador() {
		this.grilla = new ArrayList<Pelicula>();
		this.reproducidas = new ArrayList<Pelicula>();
		this.sugeridor = new Novedad();
	}
	
	public List<Pelicula> mostrarGrilla(){
		return (this.grilla.stream().collect(Collectors.toList()));
	}
	
	public List<Pelicula> sugerirPeliculas(){
		return (this.sugeridor.sugerirPeliculas(this.grilla, this.reproducidas));
	}
	
	public void setSugerencia(SugerenciaStrategy strategy) {
		this.sugeridor = strategy;
	}
	
	public Pelicula addPelicula(Pelicula peli) {
		if (!this.grilla.contains(peli)) {
			this.grilla.add(peli);
		}
		return (peli);
	}
	
	public Pelicula addReproducida(Pelicula peli) {
		if (!this.reproducidas.contains(peli) && this.grilla.contains(peli)) {
			this.reproducidas.add(peli);
		}
		return (peli);
	}
}
