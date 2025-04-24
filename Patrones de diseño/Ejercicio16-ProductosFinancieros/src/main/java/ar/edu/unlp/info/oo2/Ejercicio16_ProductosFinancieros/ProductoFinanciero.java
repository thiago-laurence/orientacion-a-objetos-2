package ar.edu.unlp.info.oo2.Ejercicio16_ProductosFinancieros;

import java.time.LocalDate;

public abstract class ProductoFinanciero {
	private LocalDate fechaOperacion;
	
	public ProductoFinanciero() {
		this.fechaOperacion = LocalDate.now();
	}
	
	public LocalDate getFechaOperacion() {
		return (this.fechaOperacion);
	}
	
	public abstract double ganancia(double montoInicial);
}
