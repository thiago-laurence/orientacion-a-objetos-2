package ar.edu.unlp.info.oo2.CodigoFinal;

public class LlamadaNacional extends Llamada{

	public LlamadaNacional(String telefonoEmisor, String telefonoReceptor, int duracion) {
		super(telefonoEmisor, telefonoReceptor, duracion);
	}

	@Override
	public double calcularCosto() {
		return (this.getDuracion() * 3 * 1.21);
	}

}
