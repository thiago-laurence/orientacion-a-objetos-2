package ar.edu.unlp.info.oo2.Ejercicio2_FridayThe13;

import java.util.List;

//import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JacksonExporter extends VoorheesExporter{
	
	@Override
	public String exportar(List<Socio> socios) {
		ObjectMapper mapper = new ObjectMapper();
	    mapper.enable(SerializationFeature.INDENT_OUTPUT);
	    String list = "";
	    try {
			list = mapper.writeValueAsString(socios);
		} catch (Exception e) {
			list = "El objeto no existe, o el formato es invalido!";
		}
	    return (list);
	}
}
