package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesJuegoDeRol;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JuegoTest {
	Personaje guerrero;
	Personaje mago;
	Personaje arquero;
	Personaje thor;

	@BeforeEach
	void setUp() throws Exception {
		guerrero = new FactoryGuerrero().fabricarPJ();
		mago = new FactoryMago().fabricarPJ();
	}

	@Test
	void testGuerrero() {
		System.out.println(guerrero.toString());
	}
	
	@Test
	void testMago(){
		System.out.println(mago.toString());
	}
	
	@Test
	void testCombate() { 
		guerrero.atacar(mago);
		assertEquals(92, mago.getVida());
		
		while (mago.estaVivo() && guerrero.estaVivo()) {
			mago.atacar(guerrero);
			guerrero.atacar(mago);
		}
		assertFalse(mago.estaVivo());
		assertTrue(guerrero.estaVivo());
	}
}
