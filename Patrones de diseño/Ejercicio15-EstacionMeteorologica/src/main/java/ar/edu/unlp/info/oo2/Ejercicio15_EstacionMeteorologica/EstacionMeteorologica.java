package ar.edu.unlp.info.oo2.Ejercicio15_EstacionMeteorologica;

import java.util.List;

public interface EstacionMeteorologica {
	public double getTemperaturaCelcius();
	
	public double getPresion();
	
	public double getRadiacionSolar();
	
	public List<Double> getTemperaturasCelsius();
	
	public double getPromedioTemperaturasCelsius();
	
	public String dataDisplay();

}
