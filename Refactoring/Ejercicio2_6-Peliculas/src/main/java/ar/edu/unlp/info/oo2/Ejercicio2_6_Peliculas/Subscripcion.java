package ar.edu.unlp.info.oo2.Ejercicio2_6_Peliculas;

public abstract class Subscripcion {
	private double extraPorEstreno;
	
	public void setExtraPorExtreno(double extra) {
		this.extraPorEstreno = extra;
	}
	
	public double getExtraPorExtreno() {
		return (this.extraPorEstreno);
	}
	
	public abstract double calcularCosto(Pelicula p);

}
