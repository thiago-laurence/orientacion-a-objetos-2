package ar.edu.unlp.info.oo2.Ejercicio16_ProductosFinancieros;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoFinancieroTest {
	ProductoCombinado combinado;
	FactoryProductoCombinado factoryProdComb;

	@BeforeEach
	void setUp() throws Exception {
		factoryProdComb = new FactoryProductoCombinado();
	}

	@Test
	void testGanancia() {
		combinado = factoryProdComb.fabricarProducto();
		assertEquals(2430, combinado.ganancia(1000));
	}

}
