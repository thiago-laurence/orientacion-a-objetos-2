package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesJuegoDeRol;

public class FactoryGuerrero implements FactoryPersonaje{

	@Override
	public Personaje fabricarPJ() {
		return (new Personaje("Guerrero", new ArmaEspada(), new ArmaduraCuero(), new HabilidadCuerpoACuerpo()));
	}
}
