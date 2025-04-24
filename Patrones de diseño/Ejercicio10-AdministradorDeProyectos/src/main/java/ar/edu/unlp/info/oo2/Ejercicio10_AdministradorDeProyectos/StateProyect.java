package ar.edu.unlp.info.oo2.Ejercicio10_AdministradorDeProyectos;

public abstract class StateProyect {
	private Proyecto proyect;
	
	public StateProyect(Proyecto proyect) {
		this.proyect = proyect;
	}
	
	public abstract void aprobarEtapa();
	
	public abstract void modificarMargenDeGanancia(double nuevoMargen);
	
	protected Proyecto getProyect() {
		return (this.proyect);
	}
}
