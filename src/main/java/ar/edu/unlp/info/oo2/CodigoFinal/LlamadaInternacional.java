package ar.edu.unlp.info.oo2.CodigoFinal;

public class LlamadaInternacional extends Llamada{

	public LlamadaInternacional(String telefonoEmisor, String telefonoReceptor, int duracion) {
		super(telefonoEmisor, telefonoReceptor, duracion);
	}

	@Override
	public double calcularCosto() {
		return (this.getDuracion() * 200 * 1.21);
	}

}
