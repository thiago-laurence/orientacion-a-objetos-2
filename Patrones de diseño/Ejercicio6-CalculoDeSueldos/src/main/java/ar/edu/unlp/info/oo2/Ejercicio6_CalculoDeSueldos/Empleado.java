package ar.edu.unlp.info.oo2.Ejercicio6_CalculoDeSueldos;

public abstract class Empleado {
	private double basico;
	private boolean estaCasado;
	public int cantHijos;
	
	public Empleado(double basico, boolean estaCasado, int cantHijos) {
		this.cantHijos = cantHijos;
		this.basico = basico;
		this.estaCasado = estaCasado;
	}
	
	public boolean estaCasado() {
		return (this.estaCasado);
	}
	
	public int cantHijos() {
		return (this.cantHijos);
	}
	
	public double basico() {
		return (this.basico);
	}
	
	public abstract double adicional();
	
	public double descuento() {
		return (this.basico() * 0.13 + this.adicional() * 0.05);
	}
	
	public double sueldo() {
		return (this.basico() + this.adicional() - this.descuento());
	}
}
