package ar.edu.unlp.info.oo2.Ejercicio7_ToDoItem;

import java.time.Duration;

public interface WorkState {
	public abstract void start(ToDoItem item);
	public abstract void togglePaused(ToDoItem item);
	public abstract void finish(ToDoItem item);
	public abstract Duration workedTime(ToDoItem item);
	public abstract void addComment(ToDoItem item, String comment);
}
