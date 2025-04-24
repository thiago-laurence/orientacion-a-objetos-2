package ar.edu.unlp.info.oo2.Ejercicio15_EstacionMeteorologica;

public class DecoratorPromedio extends DecoratorStation{

	public DecoratorPromedio(EstacionMeteorologica estacion) {
		super(estacion);
	}

	@Override
	public String dataDisplay() {
		return ("Promedio de temperaturas C: " + super.getPromedioTemperaturasCelsius() + " " + super.dataDisplay());
	}
}
