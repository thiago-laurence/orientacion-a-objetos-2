package ar.edu.unlp.info.oo2.Ejercicio9_Encriptador;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MensajeroTest {
	ConexionSegura conexion = new ConexionSegura(new RC4());

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void testMensajeEncriptado() {
		String msj = "Hola mundo!";
		
//		en = new RC4();
//		System.out.println(en.encriptar(msj));
//		en = new RSA();
//		System.out.println(en.encriptar(msj));
//		en = new Blowfish();
//		System.out.println(en.encriptar(msj));
		
		// Testeamos que haya un encriptador seteado (Por defecto RC4)
		assertNotEquals(conexion.enviar(msj), msj);
		
		// Testear que se cambia el encriptador
		conexion.setEncriptador(new RSA());
		assertNotEquals(conexion.enviar(msj), new RC4().encriptar(msj)); 
		assertEquals(conexion.enviar(msj), new RSA().encriptar(msj)); 

	}

}
