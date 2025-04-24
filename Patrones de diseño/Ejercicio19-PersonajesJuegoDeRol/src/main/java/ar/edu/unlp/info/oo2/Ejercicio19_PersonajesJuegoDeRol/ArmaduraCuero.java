package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesJuegoDeRol;

public class ArmaduraCuero implements Armadura{
	
	@Override
	public int ataqueConEspada() {
		return (8);
	}

	@Override
	public int ataqueConArco() {
		return (5);
	}

	@Override
	public int ataqueConBaston() {
		return (2);
	}

	@Override
	public int ataqueConMartillo() {
		return (1);
	}
	
	public String toString() {
		return ("Armadura de cuero");
	}

}
