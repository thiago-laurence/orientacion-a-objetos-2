package ar.edu.unlp.info.oo2.CodigoFinal;

public class PersonaFisica extends Persona{
	private String dni;

	public PersonaFisica(String nombreYApellido) {
		super(nombreYApellido);
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
}
