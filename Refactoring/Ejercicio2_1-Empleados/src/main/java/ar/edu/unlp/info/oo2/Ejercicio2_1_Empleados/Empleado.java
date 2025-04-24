package ar.edu.unlp.info.oo2.Ejercicio2_1_Empleados;

public abstract class Empleado {
	private String nombre;
	private String apellido;
	private double sueldoBasico = 0;
	protected int cantidadHijos = 0;
	
	public double sueldo() {
		return (
				this.sueldoBasico 
				- this.descuento() 
				);
	}
	
	public double descuento() {
		return (this.sueldoBasico * 0.13);
	}
	
	public abstract double plusHijos();
}
