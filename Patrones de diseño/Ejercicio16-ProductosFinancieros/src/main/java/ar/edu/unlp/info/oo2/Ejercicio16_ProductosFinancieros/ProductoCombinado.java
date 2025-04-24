package ar.edu.unlp.info.oo2.Ejercicio16_ProductosFinancieros;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ProductoCombinado extends ProductoFinanciero{
	private List<ProductoFinanciero> productos;
	
	public ProductoCombinado() {
		this.productos = new ArrayList<ProductoFinanciero>();
	}
	
	public void agregarProducto(ProductoFinanciero prod) {
		this.productos.add(prod);
	}
	
	@Override
	public double ganancia(double montoInicial) {
		double acum;
		acum = (this.productos.size() > 0) ? this.productos.get(0).ganancia(montoInicial) : 0;
		for (int i = 1; i < this.productos.size(); i++) {
			acum = this.productos.get(i).ganancia(acum);
		}
		return (acum);
	}

}
