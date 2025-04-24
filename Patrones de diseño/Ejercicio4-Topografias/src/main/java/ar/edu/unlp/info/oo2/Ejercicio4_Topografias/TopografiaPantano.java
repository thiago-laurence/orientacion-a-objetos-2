package ar.edu.unlp.info.oo2.Ejercicio4_Topografias;

public class TopografiaPantano implements Topografia{

	@Override
	public double proporcionAgua() {
		return (0.7);
	}

	@Override
	public double proporcionTierra() {
		return (0.3);
	}

	@Override
	public boolean equals(Topografia otraTopografia) {
		return (otraTopografia.equalsPantano(this));
	}
	
	@Override
	public boolean equalsPantano(TopografiaPantano otraTopografia) {
		return (true);
	}

}
