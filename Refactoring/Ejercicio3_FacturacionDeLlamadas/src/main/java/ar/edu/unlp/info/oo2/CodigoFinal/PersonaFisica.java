package ar.edu.unlp.info.oo2.CodigoFinal;

public class PersonaFisica extends Persona{
	
	public PersonaFisica(String nombreYApellido, String identificador) {
		super(nombreYApellido, identificador);
		this.setDescuento(0);
	}
	
	public String getDocumento() {
		return (this.identificador);
	}
	
	public void setDocumento(String documento) {
		this.identificador = documento;
	}
}
