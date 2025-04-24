package ar.edu.unlp.info.oo2.Ejercicio15_EstacionMeteorologica;

public class DecoratorRadiacion extends DecoratorStation{

	public DecoratorRadiacion(EstacionMeteorologica estacion) {
		super(estacion);
	}
	
	@Override
	public String dataDisplay() {
		return ("Radiacion solar: " + super.getRadiacionSolar() + " " + super.dataDisplay());
	}
}
