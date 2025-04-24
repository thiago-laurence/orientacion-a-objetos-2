package ar.edu.unlp.info.oo2.Ejercicio15_EstacionMeteorologica;

import java.util.List;
import java.util.ArrayList;

public class HomeWeatherStation {
	public HomeWeatherStation() {
		
	}

	//retorna la temperatura en grados Fahrenheit
	public double getTemperaturaFahrenheit() {
		return (82.4);
	}
	
	//retorna la presión atmosférica en hPa
	public double getPresion() {
		return (1008);
	}
	
	//retorna la radiación solar
	public double getRadiacionSolar() {
		return (500);
	}
	
	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturasFahrenheit(){
		List<Double> l = new ArrayList<Double>();
		l.add(68.0); l.add(86.0); l.add(77.0);  
		return (l);
	}
}
