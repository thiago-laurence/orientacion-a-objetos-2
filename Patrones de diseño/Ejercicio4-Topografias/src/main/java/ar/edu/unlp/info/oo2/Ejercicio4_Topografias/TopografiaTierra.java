package ar.edu.unlp.info.oo2.Ejercicio4_Topografias;

public class TopografiaTierra implements Topografia{

	@Override
	public double proporcionAgua() {
		return (0);
	}

	@Override
	public double proporcionTierra() {
		return (1);
	}

	@Override
	public boolean equals(Topografia otraTopografia) {
		return (otraTopografia.equalsTierra(this));
	}
	
	@Override
	public boolean equalsTierra(TopografiaTierra otraTopografia) {
		return (true);
	}
}
