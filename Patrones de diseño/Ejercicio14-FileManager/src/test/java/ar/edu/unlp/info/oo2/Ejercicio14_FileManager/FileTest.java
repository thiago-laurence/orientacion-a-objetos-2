package ar.edu.unlp.info.oo2.Ejercicio14_FileManager;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileTest {
	File file;

	@BeforeEach
	void setUp() throws Exception {
		file = new DecoratorNombre(new DecoratorExtension(new FileOO2("prueba", "rwx", ".txt", 8, LocalDate.of(2023, 3, 21), LocalDate.of(2023, 3, 21))));
	}

	@Test
	void testPrettyPrint() {
		System.out.println(file.prettyPrint());
		System.out.println(new DecoratorNombre(new DecoratorExtension(new DecoratorFechaCreacion(file))).prettyPrint());
		System.out.println(new DecoratorPermisos(new DecoratorNombre(new DecoratorExtension(new DecoratorTamano(file)))).prettyPrint());
	}

}
