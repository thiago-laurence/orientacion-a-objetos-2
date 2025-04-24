package ar.edu.unlp.info.oo2.Ejercicio15_EstacionMeteorologica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstacionMeteorologicaTest {
	EstacionMeteorologica estacion;

	@BeforeEach
	void setUp() throws Exception {
		estacion = new DecoratorPresion(new DecoratorRadiacion(new EstacionOO2()));
	}

	@Test
	void testDataDisplay() {
		System.out.println(new DecoratorPresion(new EstacionOO2()).dataDisplay());
		System.out.println(estacion.dataDisplay());
		System.out.println(new DecoratorPresion(new DecoratorTemperatura(new DecoratorPromedio(new EstacionOO2()))).dataDisplay());
	}

}
