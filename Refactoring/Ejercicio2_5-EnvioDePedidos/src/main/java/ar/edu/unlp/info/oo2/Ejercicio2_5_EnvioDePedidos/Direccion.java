package ar.edu.unlp.info.oo2.Ejercicio2_5_EnvioDePedidos;

public class Direccion {
	private String localidad;
	private String calle;
	private String nro;
	private String dpto;
	
	public String getDireccionFormateada() {
		return (
				this.localidad + ", " + 
				this.calle + ", " + 
				this.nro + ", " + 
				this.dpto
				);
	}
}
