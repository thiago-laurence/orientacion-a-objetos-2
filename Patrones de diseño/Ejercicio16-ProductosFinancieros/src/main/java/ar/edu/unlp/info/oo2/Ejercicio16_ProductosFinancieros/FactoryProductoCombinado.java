package ar.edu.unlp.info.oo2.Ejercicio16_ProductosFinancieros;

public class FactoryProductoCombinado implements FactoryProductoFinanciero{

	@Override
	public ProductoCombinado fabricarProducto() {
		ProductoFinanciero dolares = new CompraDolares(200); // Valor de cambio
		ProductoFinanciero plazoFijo = new PlazoFijo(30, 50); // 30 dias y 50% de interes
		ProductoFinanciero pesos = new CompraPesos(180); // Valor de cambio
		ProductoFinanciero plazoFijoRenovable = new PlazoFijoRenovable(60, 80); // 60 dias y 80% de interes
		
		ProductoCombinado prod = new ProductoCombinado();
		
		prod.agregarProducto(dolares);
		prod.agregarProducto(plazoFijo);
		prod.agregarProducto(pesos);
		prod.agregarProducto(plazoFijoRenovable);
		
		return (prod);
	}
	
}
