package ar.edu.unlp.info.oo2.Ejercicio15_EstacionMeteorologica;

import java.util.List;

public abstract class DecoratorStation implements EstacionMeteorologica{
	private EstacionMeteorologica estacion;
	
	public DecoratorStation(EstacionMeteorologica estacion) {
		this.estacion = estacion;
	}
	
	@Override
	public double getTemperaturaCelcius() {
		return(this.estacion.getTemperaturaCelcius());
	}
	
	@Override
	public double getPresion() {
		return (this.estacion.getPresion());
	}
	
	@Override
	public double getRadiacionSolar() {
		return (this.estacion.getRadiacionSolar());
	}
	
	@Override
	public List<Double> getTemperaturasCelsius(){
		return (this.estacion.getTemperaturasCelsius());
	}
	
	@Override
	public double getPromedioTemperaturasCelsius() {
		return (this.estacion.getPromedioTemperaturasCelsius());
	}
	
	@Override
	public String dataDisplay() {
		return (this.estacion.dataDisplay());
	}
}
