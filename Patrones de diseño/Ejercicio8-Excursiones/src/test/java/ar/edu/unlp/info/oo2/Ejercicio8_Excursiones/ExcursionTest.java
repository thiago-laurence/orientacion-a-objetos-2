package ar.edu.unlp.info.oo2.Ejercicio8_Excursiones;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExcursionTest {
	Excursion exc;

	@BeforeEach
	void setUp() throws Exception {
		exc = new Excursion("Dos días en kayak, bajando el Paraná", 100.0, 
				LocalDate.of(2023, 01, 01), LocalDate.of(2023, 01, 10), 1, 2, "YPF Santa teresita");
	}

	@Test
	void testInscribirObtenerInfo() {
		System.out.println("--- Provisoria ---");
		System.out.println(exc.obtenerInfo());
		exc.inscribir(new Usuario("Thiago", "Laurence", "laurence185033@unlp.edu.ar"));
		System.out.println("--- Definitiva ---");
		System.out.println(exc.obtenerInfo());
		exc.inscribir(new Usuario("Franco", "Laurence", "franco@gmail.com"));
		System.out.println("--- Completa ---");
		System.out.println(exc.obtenerInfo());
	}

}
