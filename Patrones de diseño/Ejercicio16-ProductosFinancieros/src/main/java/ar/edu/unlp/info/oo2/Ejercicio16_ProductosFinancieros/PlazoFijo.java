package ar.edu.unlp.info.oo2.Ejercicio16_ProductosFinancieros;

public class PlazoFijo extends ProductoFinanciero{
	private int cantDias;
	private double interes;
	
	public PlazoFijo(int cantDias, double interes) {
		super();
		this.cantDias = cantDias;
		this.interes = interes;
	}
	
	@Override
	public double ganancia(double montoInicial) {
		return (montoInicial + ((montoInicial * this.interes) / 100));
	}

}
