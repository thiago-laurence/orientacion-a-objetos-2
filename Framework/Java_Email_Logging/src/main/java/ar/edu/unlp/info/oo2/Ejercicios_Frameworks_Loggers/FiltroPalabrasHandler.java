package ar.edu.unlp.info.oo2.Ejercicios_Frameworks_Loggers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class FiltroPalabrasHandler extends Handler{
	private List<String> palabras;
	
	public FiltroPalabrasHandler() {
		this.palabras = new ArrayList<String>();
	}
	
	public FiltroPalabrasHandler(List<String> palabras) {
		this.palabras = new ArrayList<String>(palabras);
	}

	public void setPalabrasAFiltrar(List<String> palabras) {
		this.palabras = palabras;
	}
	
	@Override
	public void publish(LogRecord record) {
	    this.palabras.forEach(p -> {
	        if (record.getMessage().contains(p)) {
	            record.setMessage(record.getMessage().replaceAll(p, "***"));
	        }
	    });
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() throws SecurityException {
		// TODO Auto-generated method stub
		
	}

}
