package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesJuegoDeRol;

public class ArmaduraAcero implements Armadura{
	
	@Override
	public int ataqueConEspada() {
		return (3);
	}

	@Override
	public int ataqueConArco() {
		return (2);
	}

	@Override
	public int ataqueConBaston() {
		return (1);
	}

	@Override
	public int ataqueConMartillo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString() {
		return ("Armadura de acero");
	}

}
