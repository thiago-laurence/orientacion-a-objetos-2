package ar.edu.unlp.info.oo2.Ejercicio15_EstacionMeteorologica;

import java.text.DecimalFormat;

public class DecoratorTemperatura extends DecoratorStation{

	public DecoratorTemperatura(EstacionMeteorologica estacion) {
		super(estacion);
	}
	
	@Override
	public String dataDisplay() {
		DecimalFormat formato = new DecimalFormat("#.##");
		return ("Temperatura C: " + formato.format(super.getTemperaturaCelcius()) + " " + super.dataDisplay());
	}
}
