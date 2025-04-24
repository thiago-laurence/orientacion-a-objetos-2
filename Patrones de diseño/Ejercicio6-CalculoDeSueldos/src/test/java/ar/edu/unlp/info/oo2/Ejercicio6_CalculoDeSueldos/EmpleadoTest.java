package ar.edu.unlp.info.oo2.Ejercicio6_CalculoDeSueldos;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {
	Empleado planta;
	Empleado temporario;
	Empleado pasante;
	
	@BeforeEach
	void setUp() throws Exception {
		planta = new Planta(10000, true, 2, LocalDate.of(2010, 1, 1));
		pasante = new Pasante(5000, true, 1, 2);
		temporario = new Temporario(1000, false, 0, 5);
	}

	@Test
	void testSueldo() {
		assertEquals(planta.sueldo(), 41950);
		assertEquals(pasante.sueldo(), 8150);
		assertEquals(temporario.sueldo(), 2175);
	}

}
