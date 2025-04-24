package ar.edu.unlp.info.oo2.Ejercicio10_AdministradorDeProyectos;

public class EnEvaluacion extends StateProyect{

	public EnEvaluacion(Proyecto proyect) {
		super(proyect);
	}

	@Override
	public void aprobarEtapa() {
		this.getProyect().setState(new Confirmado(this.getProyect()));
	}

	@Override
	public void modificarMargenDeGanancia(double nuevoMargen) {
		if (this.getProyect().getMargenDeGanancia() >= 0.11 && this.getProyect().getMargenDeGanancia() <= 0.15) {
			this.getProyect().setMargenDeGanancia(nuevoMargen);
		}
		
	}
}
