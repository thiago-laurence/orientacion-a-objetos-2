package ar.edu.unlp.info.oo2.Ejercicio7_ToDoItem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToDoItemTest {
	ToDoItem todo;

	@BeforeEach
	void setUp() throws Exception {
		todo = new ToDoItem("Tarea de OO2");
	}

	@Test
	void testWorkedTime() {
		assertThrows(RuntimeException.class, () -> todo.workedTime());
		todo.start();
		todo.finish();
		assertEquals(Duration.class, todo.workedTime().getClass());
	}

}
