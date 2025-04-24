package ar.edu.unlp.info.oo2.Ejercicio7_ToDoItem;

import java.time.Duration;

public class Finished implements WorkState{

	@Override
	public void start(ToDoItem item) { }

	@Override
	public void togglePaused(ToDoItem item) {
		 throw new RuntimeException("El objeto ToDoItem esta en \"Finished\"!");
	}

	@Override
	public void finish(ToDoItem item) {	}

	@Override
	public Duration workedTime(ToDoItem item) {
		return (
					Duration.between(item.getComienzo(), item.getFin())
				);
	}

	@Override
	public void addComment(ToDoItem item, String comment) {	}

}
