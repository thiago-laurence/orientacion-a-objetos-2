package ar.edu.unlp.info.oo2.Ejercicio12_DecodificadorDePeliculas;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Similaridad implements SugerenciaStrategy{

	@Override
	public List<Pelicula> sugerirPeliculas(List<Pelicula> grilla, List<Pelicula> reproducidas) {		
		return (
					grilla.stream().filter(p1 -> !reproducidas.contains(p1) && 
									p1.getSimilares().stream().anyMatch(p2 -> reproducidas.contains(p2)))
					.sorted(Comparator.comparing(Pelicula::getEstreno).reversed())
					.collect(Collectors.toList())
				);
	}

}
