package ar.edu.unlp.info.oo2.Ejercicio18_SubteWay;

public class Ingrediente {
	private String nombre;
	private double precio;
	
	public Ingrediente(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return (this.nombre);
	}
	
	public double getPrecio() {
		return (this.precio);
	}
	
	public String toString() {
		return (this.getNombre() + " " + "(" + this.getPrecio() + ")");
	}
}
