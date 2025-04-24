package ar.edu.unlp.info.oo2.Ejercicio2_6_Peliculas;

public class SubscripcionPlus extends Subscripcion{

	@Override
	public double calcularCosto(Pelicula p) {
		return (
				p.getCosto()
				);
	}

}
