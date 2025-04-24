package ar.edu.unlp.info.oo2.Ejercicio9_Encriptador;

public class Mensajero {
	private Conexion con;
	
	public Mensajero() {
		this.con = new ConexionSegura(new RC4()); // Encriptador por defecto
	}
	
	public void enviar(String mensaje) {
		con.enviar(mensaje);
	}
}
