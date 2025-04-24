package ar.edu.unlp.info.oo2.Ejercicio2_6_Peliculas;

public class SubscripcionFamilia extends Subscripcion{

	@Override
	public double calcularCosto(Pelicula p) {
		return (
				p.getCosto() + 
				((p.esEstreno()) ? this.getExtraPorExtreno() * 0.90 : 0)
				);
	}

}
