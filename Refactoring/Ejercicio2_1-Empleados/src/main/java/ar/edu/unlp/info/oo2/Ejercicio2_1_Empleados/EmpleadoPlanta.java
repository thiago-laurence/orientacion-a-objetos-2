package ar.edu.unlp.info.oo2.Ejercicio2_1_Empleados;

public class EmpleadoPlanta extends Empleado{
	
	@Override
	public double plusHijos() {
		return (this.cantidadHijos * 2000);
	}
	
	@Override
	public double sueldo() {
		return (super.sueldo() + this.plusHijos());
	}
}
