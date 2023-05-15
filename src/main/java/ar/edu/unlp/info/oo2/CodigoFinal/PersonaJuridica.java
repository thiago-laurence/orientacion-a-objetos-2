package ar.edu.unlp.info.oo2.CodigoFinal;

public class PersonaJuridica extends Persona{
	private String cuit;

	public PersonaJuridica(String nombreYApellido) {
		super(nombreYApellido);
	}
	
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
}
