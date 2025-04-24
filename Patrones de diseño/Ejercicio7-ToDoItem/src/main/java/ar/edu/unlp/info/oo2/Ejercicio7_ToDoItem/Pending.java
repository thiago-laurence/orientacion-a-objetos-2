package ar.edu.unlp.info.oo2.Ejercicio7_ToDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending implements WorkState{

	@Override
	public void start(ToDoItem item) {
		item.changeState(new InProgress());
		item.setComienzo(LocalDateTime.now());
	}

	@Override
	public void togglePaused(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem esta en \"Pending\"!");
	}

	@Override
	public void finish(ToDoItem item) {	}

	@Override
	public Duration workedTime(ToDoItem item) {
		throw new RuntimeException("La tarea aun no ha comenzado!");
	}

	@Override
	public void addComment(ToDoItem item, String comment) {
		item.getComments().add(comment);
	}

}
