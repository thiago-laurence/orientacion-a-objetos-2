package ar.edu.unlp.info.oo2.Ejercicio4_Topografias;

public interface Topografia {
	public double proporcionAgua();
	public double proporcionTierra();
	public abstract boolean equals(Topografia otraTopografia);
	public default boolean equalsAgua(TopografiaAgua topografiaAgua) {
		return (false);
	}
	public default boolean equalsTierra(TopografiaTierra topografiaTierra) {
		return (false);
	}
	public default boolean equalsPantano(TopografiaPantano topografiaPantano) {
		return (false);
	}
	public default boolean equalsMixta(TopografiaMixta topografiaMixta) {
		return (false);
	}
}
