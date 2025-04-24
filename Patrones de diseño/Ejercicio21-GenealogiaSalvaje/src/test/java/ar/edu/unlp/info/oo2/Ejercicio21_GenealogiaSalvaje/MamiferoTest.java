package ar.edu.unlp.info.oo2.Ejercicio21_GenealogiaSalvaje;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MamiferoTest {
	Mamifero nala;
	Mamifero melquiades;
	Mamifero mufasa;
	Mamifero alexa;
	Mamifero elsa;
	Mamifero scar;
	Mamifero sarabi;
	Mamifero anonimo;
	
	
	@BeforeEach
	void setUp() {
		nala = new Mamifero("Nala", new NullMamifero(), new NullMamifero());
		melquiades = new Mamifero("Melquiades", new NullMamifero(), new NullMamifero());
		mufasa = new Mamifero("Mufasa");
		alexa = new Mamifero("Alexa");
		elsa = new Mamifero("Elsa", new NullMamifero(), new NullMamifero());
		scar = new Mamifero("Scar", new NullMamifero(), new NullMamifero());
		sarabi = new Mamifero("Sarabi");
		anonimo = new Mamifero();
		
		alexa.setPadre(mufasa);		alexa.setMadre(sarabi);
		mufasa.setPadre(melquiades);	mufasa.setMadre(nala);
		sarabi.setPadre(scar);	sarabi.setMadre(elsa);
//		nala.setMadre(new NullMamifero());	nala.setPadre(new NullMamifero());
//		melquiades.setMadre(new NullMamifero());	melquiades.setPadre(new NullMamifero());
//		elsa.setMadre(new NullMamifero()); elsa.setPadre(new NullMamifero());
//		scar.setMadre(new NullMamifero()); scar.setPadre(new NullMamifero());
	}
	
	@Test
	void testAbuelaMaterna() {
		assertEquals(elsa, alexa.getAbuelaMaterna());	
		assertNotNull(sarabi.getAbuelaMaterna());
		assertNull(elsa.getAbuelaMaterna());
	}
	
	@Test
	void testAbuelaPaterna() {
		assertEquals(nala, alexa.getAbuelaPaterna());	
		assertNotNull(mufasa.getAbuelaPaterna());
		assertNull(nala.getAbuelaPaterna());

	}
	
	@Test
	void testAbueloMaterno() {
		assertEquals(scar, alexa.getAbueloMaterno());	
		assertNotNull(sarabi.getAbueloMaterno());
		assertNull(scar.getAbueloMaterno());

	}
	
	@Test
	void testAbueloPaterno() {
		assertEquals(melquiades, alexa.getAbueloPaterno());	
		assertNotNull(mufasa.getAbueloPaterno());
		assertNull(melquiades.getAbueloPaterno());

	}
	
	@Test
	void testEspecie() {
		anonimo.setEspecie("Panthera leo");
		assertEquals("Panthera leo", anonimo.getEspecie());
	}
	
	@Test
	void testIdentificador() {
		anonimo.setIdentificador("Nala");
		assertEquals("Nala", anonimo.getIdentificador());
	}
	
	@Test
	void testMadre() {
		anonimo.setMadre(alexa);
		assertEquals(alexa, anonimo.getMadre());
		assertNotNull(nala.getMadre());
	}
	
	@Test
	void testPadre() {
		anonimo.setPadre(mufasa);
		assertEquals(mufasa, anonimo.getPadre());
		assertNotNull(nala.getPadre());
	}
	
	@Test
	void testTieneComoAncestroA() {
		assertFalse(nala.tieneComoAncestroA(anonimo));
		assertFalse(mufasa.tieneComoAncestroA(anonimo));
		assertFalse(alexa.tieneComoAncestroA(anonimo));
		assertFalse(alexa.tieneComoAncestroA(alexa));
		assertTrue(alexa.tieneComoAncestroA(mufasa));
		assertTrue(alexa.tieneComoAncestroA(sarabi));
		assertTrue(alexa.tieneComoAncestroA(nala));
		assertTrue(alexa.tieneComoAncestroA(melquiades));
		assertTrue(alexa.tieneComoAncestroA(elsa));
		assertTrue(alexa.tieneComoAncestroA(scar));
		
	}
	
}
