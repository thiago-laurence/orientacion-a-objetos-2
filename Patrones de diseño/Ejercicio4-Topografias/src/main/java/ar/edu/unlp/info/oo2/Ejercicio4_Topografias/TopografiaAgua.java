package ar.edu.unlp.info.oo2.Ejercicio4_Topografias;

public class TopografiaAgua implements Topografia{

	@Override
	public double proporcionAgua() {
		return (1);
	}

	@Override
	public double proporcionTierra() {
		return (0);
	}

	@Override
	public boolean equals(Topografia otraTopografia) {
		return (otraTopografia.equalsAgua(this));
	}
	
	@Override
	public boolean equalsAgua(TopografiaAgua topografia) {
		return (true);
	}
	
}
