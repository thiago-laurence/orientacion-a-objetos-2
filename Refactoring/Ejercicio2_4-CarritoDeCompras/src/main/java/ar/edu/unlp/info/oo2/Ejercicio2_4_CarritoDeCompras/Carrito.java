package ar.edu.unlp.info.oo2.Ejercicio2_4_CarritoDeCompras;

import java.util.List;
import java.util.ArrayList;

public class Carrito {
	private List<CarritoItem> items;
	
	public Carrito() {
		this.items = new ArrayList<CarritoItem>();
	}
	
	public double total() {
		return (
				this.items.stream().mapToDouble(i -> i.getTotal()).sum()
				);
	}
}
