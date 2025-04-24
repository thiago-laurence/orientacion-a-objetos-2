package ar.edu.unlp.info.oo2.Ejercicio13_AccesoABaseDeDatos;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import ar.edu.unlp.info.oo2.Ejercicios_Frameworks_Loggers.EmailHandler;
import ar.edu.unlp.info.oo2.Ejercicios_Frameworks_Loggers.FiltroPalabrasHandler;
import ar.edu.unlp.info.oo2.Ejercicios_Frameworks_Loggers.JSONFormatter;
import ar.edu.unlp.info.oo2.Ejercicios_Frameworks_Loggers.UppercaseFormatter;


public class DatabaseProxyAccess implements DatabaseAccess{
	private DatabaseAccess database;
	private Logger logger;
	
	public DatabaseProxyAccess(DatabaseAccess database, String validation) {
		logger = Logger.getLogger("DatabaseProxyAccess");
		List<String> palabras = new ArrayList<String>();
		palabras.add("switch-statements");
		
		Handler hFiltro = new FiltroPalabrasHandler(palabras);
		Handler hSimpleUppercase = new ConsoleHandler();
		Handler hSimpleJSON = new ConsoleHandler();
		Handler hEmail = new EmailHandler();
		
		hFiltro.setFormatter(new SimpleFormatter());
		hSimpleUppercase.setFormatter(new UppercaseFormatter());
		hSimpleJSON.setFormatter(new JSONFormatter());
		hEmail.setFormatter(new SimpleFormatter());
		
		logger.addHandler(hFiltro);
		logger.addHandler(hSimpleUppercase);
		logger.addHandler(hSimpleJSON);
		logger.addHandler(hEmail);
		logger.info("I love switch-statements");
		
		if (!this.cheackAccess(validation)) {
			logger.log(Level.SEVERE, "Acceso invalido a BD!");
			throw new RuntimeException("Usted no se ha autenticado previamente, acceso denegado!");
		}
		
		this.database = database;
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		logger.log(Level.INFO, "Acceso valido a BD para busqueda");
		return (this.database.getSearchResults(queryString));
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		logger.log(Level.WARNING, "Acceso valido a BD para insercion");
		return (this.database.insertNewRow(rowData));
	}
	
	private boolean cheackAccess(String validation) {
		return ((validation == "ok") ? true : false);
	}
}
