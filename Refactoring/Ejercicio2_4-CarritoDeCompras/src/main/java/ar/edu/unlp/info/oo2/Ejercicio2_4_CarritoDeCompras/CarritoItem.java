package ar.edu.unlp.info.oo2.Ejercicio2_4_CarritoDeCompras;

public class CarritoItem {
	private int cantidad;
	private Producto prod;
	
	public int getCantidad() {
		return (this.cantidad);
	}
	
	public Producto getProducto() {
		return (this.prod);
	}
	
	public double getTotal() {
		return (this.getProducto().getPrecio() * this.getCantidad());
	}
}
