package ar.edu.unlp.info.oo2.Ejercicio10_AdministradorDeProyectos;

public class EnConstruccion extends StateProyect{

	public EnConstruccion(Proyecto proyect) {
		super(proyect);
	}

	@Override
	public void aprobarEtapa() {
		if (this.getProyect().precioDelProyecto() != 0) {
			this.getProyect().setState(new EnEvaluacion(this.getProyect()));
		}else {
			throw new RuntimeException("El precio del proyecto es cero!");
		}
		
	}

	@Override
	public void modificarMargenDeGanancia(double nuevoMargen) {
		if (this.getProyect().getMargenDeGanancia() >= 0.08 && this.getProyect().getMargenDeGanancia() <= 0.1) {
			this.getProyect().setMargenDeGanancia(nuevoMargen);
		}
	}

}
