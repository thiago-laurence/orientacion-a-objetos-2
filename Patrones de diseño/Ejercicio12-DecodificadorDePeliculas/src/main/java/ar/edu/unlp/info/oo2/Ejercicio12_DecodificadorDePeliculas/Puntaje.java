package ar.edu.unlp.info.oo2.Ejercicio12_DecodificadorDePeliculas;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje implements SugerenciaStrategy{

	@Override
	public List<Pelicula> sugerirPeliculas(List<Pelicula> grilla, List<Pelicula> reproducidas) {
		return (
					grilla.stream().filter(p -> !reproducidas.contains(p))
					.sorted(Comparator.comparing(Pelicula::getPuntaje).reversed())
					.limit(3)
					.collect(Collectors.toList())
				);
	}

}
