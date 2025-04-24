package ar.edu.unlp.info.oo2.Ejercicio2_5_EnvioDePedidos;

public class Cliente {
	private Direccion direcc;
	
	public String getDireccion() {
		return (this.direcc.getDireccionFormateada());
	}
}
