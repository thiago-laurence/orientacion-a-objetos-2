package ar.edu.unlp.info.oo2.Ejercicio6_CalculoDeSueldos;

public class Temporario extends Empleado{
	private int cantHoras;
	
	public Temporario(double basico, boolean estaCasado, int cantHijos, int cantHoras) {
		super(basico, estaCasado, cantHijos);
		this.cantHoras = cantHoras;
	}

	@Override
	public double adicional() {
		double add = (this.estaCasado()) ? 5000 : 0;
		return (add + this.cantHijos * 2000);
	}
	
	@Override
	public double basico() {
		return ((super.basico() + this.cantHoras() * 300)); 
	}
	
	public int cantHoras() {
		return (this.cantHoras);
	}
}
