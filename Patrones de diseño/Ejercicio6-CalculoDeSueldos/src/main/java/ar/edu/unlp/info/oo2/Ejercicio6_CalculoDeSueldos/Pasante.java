package ar.edu.unlp.info.oo2.Ejercicio6_CalculoDeSueldos;

public class Pasante extends Empleado{
	private int cantExamenes;

	public Pasante(double basico, boolean estaCasado, int cantHijos, int cantExamenes) {
		super(basico, estaCasado, cantHijos);
		this.cantExamenes = cantExamenes;
	}

	@Override
	public double adicional() {
		return (this.cantExamenes * 2000);
	}
}
