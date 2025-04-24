package ar.edu.unlp.info.oo2.Ejercicio10_AdministradorDeProyectos;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProyectoTest {
	Proyecto p;

	@BeforeEach
	void setUp() throws Exception {
		p = new Proyecto("Vacaciones de invierno", "Salir con amigos", 3, LocalDate.of(2023, 3, 21), LocalDate.of(2023, 3, 31), 10);
		p.aprobarEtapa();
	}

	@Test
	void testPrecioDelProyecto() {
		assertEquals(33, p.precioDelProyecto());
	}

	@Test
	void testCostoDelProyecto() {
		assertEquals(300, p.costoDelProyecto());
	}
	
	@Test
	void testModificarMargenDeGanancia() {
		p.modificarMargenDeGanancia(0.2);
		assertEquals(0.2, p.getMargenDeGanancia());
	}
}
