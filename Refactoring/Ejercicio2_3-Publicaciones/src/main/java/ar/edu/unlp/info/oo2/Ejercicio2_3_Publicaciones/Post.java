package ar.edu.unlp.info.oo2.Ejercicio2_3_Publicaciones;

import java.time.LocalDate;

public class Post {
	private String texto;
	private LocalDate fecha;
	private Usuario user;
	
	public Usuario getUsuario() {
		return (this.user);
	}
	
	public LocalDate getFecha() {
		return (this.fecha);
	}
}
