package ar.edu.unlp.info.oo2.Ejercicio18_SubteWay;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Sandwich {
	private String nombre;
	private List<Ingrediente> ingredientes;
	
	public Sandwich(String nombre, List<Ingrediente> ingredientes) {
		this.nombre = nombre;
		this.ingredientes = new ArrayList<Ingrediente>(ingredientes);
	}
	
	public double calcularCosto() {
		return (
					this.ingredientes.stream()
						.mapToDouble(i -> i.getPrecio()).sum()
				);
	}
	
	public String getNombre() {
		return (this.nombre);
	}
	
	public List<Ingrediente> getIgredientes(){
		return (this.ingredientes.stream().collect(Collectors.toList()));
	}
	
	public String toString() {
		StringBuilder stb = new StringBuilder();
		stb.append(this.getNombre() + ": ");
		this.getIgredientes().forEach(i -> stb.append(i.toString() + ", "));
		return (stb.substring(0, stb.length() - 2));
	}
}
