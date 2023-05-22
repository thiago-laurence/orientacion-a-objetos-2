package ar.edu.unlp.info.oo2.CodigoFinal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersoonalTest {

	Persoonal sistema;
	Persona emisorPersonaFisica, emisorPersonaJuridica, remitentePersonaFisica, remitentePersonaJuridica;
	
	@BeforeEach
	public void setUp() {
		this.sistema = new Persoonal();
		this.sistema.agregarTelefono("2214444554");
		this.sistema.agregarTelefono("2214444555");
		this.sistema.agregarTelefono("2214444556");
		this.sistema.agregarTelefono("2214444557");
		
		this.emisorPersonaFisica = sistema.registrarPersonaFisica("11555666", "Marcelo Tinelli");
		this.emisorPersonaJuridica = sistema.registrarPersonaJuridica("17555222", "Felfort");
		this.remitentePersonaFisica = sistema.registrarPersonaFisica("00000001", "Mirtha Legrand");
		this.remitentePersonaJuridica = sistema.registrarPersonaJuridica("25765432", "Moovistar");
	
		
		
		this.sistema.registrarLlamadaNacional(emisorPersonaJuridica, remitentePersonaFisica, 10);
		this.sistema.registrarLlamadaInternacional(emisorPersonaJuridica, remitentePersonaFisica, 8);
		this.sistema.registrarLlamadaNacional(emisorPersonaJuridica, remitentePersonaJuridica, 5);
		this.sistema.registrarLlamadaInternacional(emisorPersonaJuridica, remitentePersonaJuridica, 7);
		this.sistema.registrarLlamadaNacional(emisorPersonaFisica, remitentePersonaFisica, 15);
		this.sistema.registrarLlamadaInternacional(emisorPersonaFisica, remitentePersonaFisica, 45);
		this.sistema.registrarLlamadaNacional(emisorPersonaFisica, remitentePersonaJuridica, 13);
		this.sistema.registrarLlamadaInternacional(emisorPersonaFisica, remitentePersonaJuridica, 17);
		
	}

	@Test
	void testcalcularMontoTotalLlamadas() {
		assertEquals(this.sistema.calcularMontoTotalLlamadas(emisorPersonaFisica), 15105.640000000001);
		assertEquals(this.sistema.calcularMontoTotalLlamadas(emisorPersonaJuridica), 3131.7825000000003);
		assertEquals(this.sistema.calcularMontoTotalLlamadas(remitentePersonaFisica), 0);
		assertEquals(this.sistema.calcularMontoTotalLlamadas(remitentePersonaJuridica), 0);
	}
	
	@Test
	void testAgregarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 4);
		this.sistema.agregarTelefono("2214444558"); 
		Persona nuevaPersona = this.sistema.registrarPersonaFisica("2444555","Chiche Gelblung");
		
		assertEquals(this.sistema.cantidadDeUsuarios(), 5);
		assertTrue(this.sistema.existeUsuario(nuevaPersona));
		
	}
	
	@Test
	void testEliminarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 4);
		assertTrue(this.sistema.existeUsuario(emisorPersonaFisica));
		this.sistema.eliminarUsuario(emisorPersonaFisica);
		assertEquals(this.sistema.cantidadDeUsuarios(), 3);
		assertFalse(this.sistema.existeUsuario(emisorPersonaFisica));
	}

}
