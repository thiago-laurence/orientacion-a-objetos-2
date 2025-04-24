package ar.edu.unlp.info.oo2.CodigoFinal;

public class PersonaJuridica extends Persona{
	public PersonaJuridica(String nombreYApellido, String identificador) {
		super(nombreYApellido, identificador);
		this.setDescuento(0.15);
	}
	
	public String getCuit() {
		return (this.identificador);
	}
	
	public void setCuit(String cuit) {
		this.identificador = cuit;
	}

}
