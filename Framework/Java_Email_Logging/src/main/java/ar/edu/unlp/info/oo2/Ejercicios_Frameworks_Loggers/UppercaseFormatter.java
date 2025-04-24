package ar.edu.unlp.info.oo2.Ejercicios_Frameworks_Loggers;

import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class UppercaseFormatter extends SimpleFormatter{
	@Override
	public String format(LogRecord record) {
		String message = record.getMessage().toUpperCase();
		record.setMessage(message);
		return (message);
	}
}
