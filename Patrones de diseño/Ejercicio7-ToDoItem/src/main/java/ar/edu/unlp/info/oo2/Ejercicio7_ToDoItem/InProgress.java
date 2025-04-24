package ar.edu.unlp.info.oo2.Ejercicio7_ToDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public class InProgress implements WorkState{

	@Override
	public void start(ToDoItem item) { }

	@Override
	public void togglePaused(ToDoItem item) {
		item.changeState(new Paused());
	}

	@Override
	public void finish(ToDoItem item) {
		item.changeState(new Finished());
		item.setFin(LocalDateTime.now());
	}

	@Override
	public Duration workedTime(ToDoItem item) {
		return (
					Duration.between(item.getComienzo(), LocalDateTime.now()) 
				);
	}

	@Override
	public void addComment(ToDoItem item, String comment) {
		item.getComments().add(comment);
	}

}
