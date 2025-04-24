package ar.edu.unlp.info.oo2.Ejercicio2_1_Empleados;

public class EmpleadoTemporario extends Empleado{
	private double horasTrabajadas = 0;
	
	public double plusHoras() {
		return (this.horasTrabajadas * 500);
	}
	
	@Override
	public double plusHijos() {
		return (this.cantidadHijos * 1000);
	}
	
	@Override
	public double sueldo() {
		return (super.sueldo() + this.plusHoras() + this.plusHijos());
	}
}
