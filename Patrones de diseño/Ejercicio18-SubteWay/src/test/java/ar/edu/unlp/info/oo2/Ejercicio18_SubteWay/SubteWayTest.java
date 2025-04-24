package ar.edu.unlp.info.oo2.Ejercicio18_SubteWay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubteWayTest {
	SubteWay subway;
	Sandwich s;

	@BeforeEach
	void setUp() throws Exception {
		subway = new SubteWay(new BuilderClasico());
	}

	@Test
	void testBuilderClasico() {
		s = subway.construirSandwich();
		System.out.println(s.toString());
		assertEquals(500, s.calcularCosto());
	}
	
	@Test
	void testBuilderSinTacc() {
		subway.setBuilder(new BuilderSinTacc());
		s = subway.construirSandwich();
		System.out.println(s.toString());
		assertEquals(618, s.calcularCosto());
	}
	
	@Test
	void testBuilderVegetariano() {
		subway.setBuilder(new BuilderVegetariano());
		s = subway.construirSandwich();
		System.out.println(s.toString());
		assertEquals(420, s.calcularCosto());
	}
	
	@Test
	void testBuilderVegano() {
		subway.setBuilder(new BuilderVegano());
		s = subway.construirSandwich();
		System.out.println(s.toString());
		assertEquals(620, s.calcularCosto());
	}

}
