package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesJuegoDeRol;

public class FactoryMago implements FactoryPersonaje{
	
	@Override
	public Personaje fabricarPJ() {
		return (new Personaje("Mago", new ArmaBaston(), new ArmaduraCuero(), new HabilidadMagia()));
	}

}
