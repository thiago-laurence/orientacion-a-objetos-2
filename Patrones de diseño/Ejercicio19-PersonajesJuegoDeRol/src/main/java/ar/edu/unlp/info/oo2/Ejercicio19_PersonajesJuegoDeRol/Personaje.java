package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesJuegoDeRol;

public class Personaje {
	private String nombre;
	private int vida;
	private Arma arma;
	private Armadura armadura;
	private Habilidad habilidad;
	
	public Personaje(String nombre, Arma arma, Armadura armadura, Habilidad habilidad) {
		this.nombre = nombre;
		this.vida = 100;
		this.arma = arma;
		this.armadura = armadura;
		this.habilidad = habilidad;
	}
	
	public boolean estaVivo() {
		return (this.vida > 0);
	}
	
	public int getVida() {
		return (this.vida);
	}
	
	public void atacar(Personaje enemigo) {
		enemigo.actualizarVida(
					this.getArma().calcularDaño(enemigo.getArmadura())
				);
	}
	
	protected void actualizarVida(int daño) {
		this.vida = (daño > this.getVida()) ? 0 : 
			(this.getVida() - daño);
	}
	
	public Arma getArma() {
		return (this.arma);
	}
	
	public Armadura getArmadura() {
		return (this.armadura);
	}
	
	public Habilidad getHabilidad() {
		return (this.habilidad);
	}
	
	public String toString() {
		return (this.nombre + "(" 
					+ this.arma + ", " 
					+ this.armadura + ", " 
					+ this.habilidad
				+ ")");
	}
}
