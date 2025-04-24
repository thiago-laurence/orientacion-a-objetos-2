package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesJuegoDeRol;

public class ArmaEspada implements Arma{

	@Override
	public int calcularDaño(Armadura armadura) {
		return (armadura.ataqueConEspada());
	}
	
	public String toString() {
		return ("Espada");
	}

}
