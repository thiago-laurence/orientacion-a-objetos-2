package ar.edu.unlp.info.oo2.Ejercicio2_FridayThe13;

import static org.junit.Assert.assertEquals;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	Biblioteca b;
	String JSONOriginal = "";
	JSONParser parser;
	
	@BeforeEach
	void setUp() throws Exception {
		b = new Biblioteca();
		b.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		b.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2"));
		JSONOriginal = b.exportarSocios();
		parser = new JSONParser();
	}

	@Test
	void testExportarSociosJSONExporter() throws ParseException {
		System.out.println("------------JSONSimpleExporter---------------");
		b.setExporter(new JsonSimpleExporter());
		assertEquals(parser.parse(JSONOriginal), parser.parse(b.exportarSocios()));
	}
	
	@Test
	void testExportarSociosJacksonExporter() throws ParseException {
		System.out.println("----------------JacksonExporter-----------");
		b.setExporter(new JacksonExporter());
		assertEquals(parser.parse(JSONOriginal), parser.parse(b.exportarSocios()));
	}
}
