package ar.edu.unlp.info.oo2.Ejercicio2_2_Juego;

public class Jugador {
	private String nombre, apellido;
	private int puntuacion;
	
	public void incrementarPuntuacion() {
		this.puntuacion += 100;
	}
	
	public void decrementarPuntuacion() {
		this.puntuacion -= 50;
	}
}
