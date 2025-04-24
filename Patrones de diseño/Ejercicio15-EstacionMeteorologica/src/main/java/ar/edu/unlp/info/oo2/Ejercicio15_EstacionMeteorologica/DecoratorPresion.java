package ar.edu.unlp.info.oo2.Ejercicio15_EstacionMeteorologica;

public class DecoratorPresion extends DecoratorStation{

	public DecoratorPresion(EstacionMeteorologica estacion) {
		super(estacion);
	}

	@Override
	public String dataDisplay() {
		return ("Presion atomosferica: " + super.getPresion() + " " + super.dataDisplay());
	}
}
