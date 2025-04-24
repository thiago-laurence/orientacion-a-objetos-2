package ar.edu.unlp.info.oo2.Ejercicio16_ProductosFinancieros;

public class CompraPesos extends ProductoFinanciero{
	private double valorCompra;
	
	public CompraPesos(double valorCompra) {
		super();
		this.valorCompra = valorCompra;
	}

	@Override
	public double ganancia(double montoInicial) {
		return (montoInicial * this.valorCompra);
	}
	

}
