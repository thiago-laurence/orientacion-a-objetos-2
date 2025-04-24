package ar.edu.unlp.info.oo2.Ejercicio12_DecodificadorDePeliculas;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DecodificadorTest {
	Decodificador deco;

	@BeforeEach
	void setUp() throws Exception {
		deco = new Decodificador();
		Pelicula p1 = deco.addPelicula(new Pelicula("Thor", 7.9, 2007));
		Pelicula p2 = deco.addPelicula(new Pelicula("Capitan america", 7.8, 2016));
		Pelicula p3 = deco.addPelicula(new Pelicula("Iron man", 7.9, 2010));
		Pelicula p4 = deco.addPelicula(new Pelicula("Dunkirk", 7.9, 2017));
		Pelicula p5 = deco.addPelicula(new Pelicula("Rocky", 8.1, 1976));
		Pelicula p6 = deco.addPelicula(new Pelicula("Rambo", 7.8, 1979));
		
		p1.setSimilar(p2); p1.setSimilar(p3);
		p2.setSimilar(p3);
		p5.setSimilar(p6);
		
		deco.addReproducida(p1);
		deco.addReproducida(p5);
	}

	@Test
	void testMostrarGrilla() {
//		deco.mostrarGrilla().forEach(p -> System.out.println(p));
	}
	
	@Test
	void testRecomendar() {
		System.out.println("-- Novedad --");
		deco.setSugerencia(new Novedad());
		deco.sugerirPeliculas().forEach(p -> System.out.print(p.getTitulo() + " - "));
		
		System.out.println("\n-- Similaridad --");
		deco.setSugerencia(new Similaridad());
		deco.sugerirPeliculas().forEach(p -> System.out.print(p.getTitulo() + " - "));
		
		System.out.println("\n-- Puntaje --");
		deco.setSugerencia(new Puntaje());
		deco.sugerirPeliculas().forEach(p -> System.out.print(p.getTitulo() + " - "));
	}
}
