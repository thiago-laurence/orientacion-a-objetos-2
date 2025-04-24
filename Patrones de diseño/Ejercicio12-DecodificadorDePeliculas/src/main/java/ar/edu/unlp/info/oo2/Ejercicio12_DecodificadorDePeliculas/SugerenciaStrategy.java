package ar.edu.unlp.info.oo2.Ejercicio12_DecodificadorDePeliculas;

import java.util.List;

public interface SugerenciaStrategy {
	List<Pelicula> sugerirPeliculas(List<Pelicula> grilla, List<Pelicula> reproducidas);
}
