package ar.edu.unlp.info.oo2.Ejercicios_Frameworks_Loggers;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class JSONFormatter extends Formatter{
	@Override
	public String format(LogRecord record) {
		String message = "{ " +
						"message: " + record.getMessage() + ", " +
						"level: " + record.getLevel()
						+ " }";
		record.setMessage(message);
		return (message);
	}
}
