package ar.edu.unlp.info.oo2.Ejercicio8_Excursiones;

public class Usuario {
	private String nombre, apellido, email;
	
	public Usuario(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	
	public String getEmail() {
		return (this.email);
	}
}
