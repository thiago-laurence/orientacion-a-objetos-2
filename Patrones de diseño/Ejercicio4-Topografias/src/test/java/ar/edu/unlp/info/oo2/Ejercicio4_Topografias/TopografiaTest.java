package ar.edu.unlp.info.oo2.Ejercicio4_Topografias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopografiaTest {
	Topografia agua;
	Topografia tierra;
	Topografia pantano;
	TopografiaMixta mixta;
	
	@BeforeEach
    void setUp() throws Exception {
		agua = new TopografiaAgua();
		tierra = new TopografiaTierra();
		pantano = new TopografiaPantano();
		mixta = new TopografiaMixta();
		mixta.agregarTopografia(new TopografiaAgua());
		mixta.agregarTopografia(new TopografiaTierra());
		mixta.agregarTopografia(new TopografiaTierra());
		mixta.agregarTopografia(new TopografiaAgua());
	}
	
	@Test
	void testEqualsTopografiaAtomica() {
		Topografia topoAgua = new TopografiaAgua();
		assertTrue(topoAgua.equals(agua));
		assertFalse(topoAgua.equals(tierra));
		assertFalse(topoAgua.equals(pantano));
		assertFalse(topoAgua.equals(mixta));
		
		Topografia topoTierra = new TopografiaTierra();
		assertTrue(topoTierra.equals(tierra));
		assertFalse(topoTierra.equals(agua));
		assertFalse(topoTierra.equals(mixta));
		assertFalse(topoTierra.equals(pantano));
		
		Topografia topoPantano = new TopografiaPantano();
		assertTrue(topoPantano.equals(pantano));
		assertFalse(topoPantano.equals(tierra));
		assertFalse(topoPantano.equals(agua));
		assertFalse(topoPantano.equals(mixta));
	}
	
	@Test
	void testEqualsTopografiaMixta() {
		TopografiaMixta otraMixta = new TopografiaMixta();
		otraMixta.agregarTopografia(new TopografiaAgua());
		otraMixta.agregarTopografia(new TopografiaTierra());
		otraMixta.agregarTopografia(new TopografiaTierra());
		otraMixta.agregarTopografia(new TopografiaAgua());
		assertTrue(otraMixta.equals(mixta));
		
//		Distinta composicion
		otraMixta = new TopografiaMixta();
		otraMixta.agregarTopografia(new TopografiaAgua());
		otraMixta.agregarTopografia(new TopografiaAgua());
		otraMixta.agregarTopografia(new TopografiaTierra());
		otraMixta.agregarTopografia(new TopografiaTierra());
		assertFalse(otraMixta.equals(mixta));
		
//		DistintaProporcion
		otraMixta = new TopografiaMixta();
		otraMixta.agregarTopografia(new TopografiaAgua());
		otraMixta.agregarTopografia(new TopografiaAgua());
		otraMixta.agregarTopografia(new TopografiaAgua());
		otraMixta.agregarTopografia(new TopografiaTierra());
		assertFalse(otraMixta.equals(mixta));
		
//		MixtasMultiples
		otraMixta = new TopografiaMixta();
		otraMixta.agregarTopografia(new TopografiaAgua());
		otraMixta.agregarTopografia(new TopografiaTierra());
		otraMixta.agregarTopografia(new TopografiaTierra());
		mixta = new TopografiaMixta();
		mixta.agregarTopografia(new TopografiaAgua());
		mixta.agregarTopografia(new TopografiaTierra());
		mixta.agregarTopografia(new TopografiaTierra());
		
		TopografiaMixta mixtaMultiple = new TopografiaMixta();
		mixtaMultiple.agregarTopografia(new TopografiaAgua());
		mixtaMultiple.agregarTopografia(new TopografiaTierra());
		mixtaMultiple.agregarTopografia(new TopografiaTierra());
		mixtaMultiple.agregarTopografia(new TopografiaAgua());
		
		otraMixta.agregarTopografia(mixtaMultiple);
		mixta.agregarTopografia(mixtaMultiple);
		assertTrue(otraMixta.equals(mixta));
		
		mixta = new TopografiaMixta();
		mixta.agregarTopografia(new TopografiaAgua());
		mixta.agregarTopografia(new TopografiaTierra());
		mixta.agregarTopografia(new TopografiaTierra());
		mixtaMultiple = new TopografiaMixta();
		mixtaMultiple.agregarTopografia(new TopografiaAgua());
		mixtaMultiple.agregarTopografia(new TopografiaTierra());
		mixtaMultiple.agregarTopografia(new TopografiaTierra());
		mixtaMultiple.agregarTopografia(new TopografiaTierra());
		
		assertFalse(otraMixta.equals(mixta));
	}
}
