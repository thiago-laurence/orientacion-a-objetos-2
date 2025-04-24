package ar.edu.unlp.info.oo2.Ejercicio15_EstacionMeteorologica;

import java.util.List;
import java.util.stream.Collectors;

public class EstacionOO2 implements EstacionMeteorologica{
	private HomeWeatherStation home;
	
	public EstacionOO2() {
		this.home = new HomeWeatherStation();
	}
	
	
	@Override
	public double getTemperaturaCelcius() {
		return ((this.home.getTemperaturaFahrenheit() - 32) / 1.8);
	}

	@Override
	public double getPresion() {
		return (this.home.getPresion());
	}

	@Override
	public double getRadiacionSolar() {
		return (this.home.getRadiacionSolar());
	}

	@Override
	public List<Double> getTemperaturasCelsius() {
		return (
					this.home.getTemperaturasFahrenheit().stream().map(d -> (d - 32) / 1.8)
					.collect(Collectors.toList())
				);
	}

	@Override
	public double getPromedioTemperaturasCelsius() {
		return (
					this.getTemperaturasCelsius().stream().mapToDouble(d -> d).sum()
					/
					this.getTemperaturasCelsius().size()
				);
	}

	@Override
	public String dataDisplay() {
		return ("");
	}
	
	

}
