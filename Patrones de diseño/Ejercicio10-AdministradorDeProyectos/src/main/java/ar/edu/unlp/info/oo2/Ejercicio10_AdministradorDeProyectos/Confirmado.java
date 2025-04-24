package ar.edu.unlp.info.oo2.Ejercicio10_AdministradorDeProyectos;

public class Confirmado extends StateProyect{

	public Confirmado(Proyecto proyect) {
		super(proyect);
	}

	@Override
	public void aprobarEtapa() {	}

	@Override
	public void modificarMargenDeGanancia(double nuevoMargen) {		}

}
