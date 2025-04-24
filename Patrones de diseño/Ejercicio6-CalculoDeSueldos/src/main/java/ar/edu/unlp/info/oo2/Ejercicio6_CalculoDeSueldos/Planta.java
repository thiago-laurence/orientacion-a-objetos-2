package ar.edu.unlp.info.oo2.Ejercicio6_CalculoDeSueldos;

import java.time.LocalDate;
import java.time.Period;

public class Planta extends Empleado{
	private LocalDate fechaIngreso;
	
	public Planta(double basico, boolean estaCasado, int cantHijos, LocalDate fechaIngreso) {
		super(basico, estaCasado, cantHijos);
		this.fechaIngreso = fechaIngreso;
	}
	
	public int antiguedad() {
		return (Period.between(fechaIngreso, LocalDate.now()).getYears());
	}

	@Override
	public double adicional() {
		double add = (this.estaCasado()) ? 5000 : 0;
		return (add + this.cantHijos() * 2000 + this.antiguedad() * 2000);
	}
	
}
