package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesJuegoDeRol;

public class ArmaBaston implements Arma{
	
	@Override
	public int calcularDaño(Armadura armadura) {
		return (armadura.ataqueConBaston());
	}
	
	public String toString() {
		return ("Baston");
	}
}
