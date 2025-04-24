package ar.edu.unlp.info.oo2.Ejercicio2_FridayThe13;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonSimpleExporter extends VoorheesExporter{
		
	@SuppressWarnings("unchecked")
	@Override
	public String exportar(List<Socio> socios) {
		JSONArray list = new JSONArray();
		socios.forEach(s ->	{
								JSONObject jObj = new JSONObject();
								jObj.put("nombre", s.getNombre());
								jObj.put("email", s.getEmail());
								jObj.put("legajo", s.getLegajo());
								list.add(jObj);
		
		});
		return (list.toJSONString());
	}
	
}
