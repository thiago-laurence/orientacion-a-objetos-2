package ar.edu.unlp.info.oo2.CodigoFinal;

public abstract class Persona {
	private String nombreYapellido;
	private String telefono;
	
	public Persona(String nombreYApellido) {
		this.nombreYapellido = nombreYApellido;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
