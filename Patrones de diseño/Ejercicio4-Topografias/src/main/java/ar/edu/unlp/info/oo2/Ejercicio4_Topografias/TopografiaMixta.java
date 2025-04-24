package ar.edu.unlp.info.oo2.Ejercicio4_Topografias;

import java.util.ArrayList;
import java.util.List;

public class TopografiaMixta implements Topografia{
	private List<Topografia> partes;
	
	public TopografiaMixta() {
		this.partes = new ArrayList<Topografia>();
	}

	@Override
	public double proporcionAgua() {
		return (
					this.getPartes().stream().mapToDouble(p -> p.proporcionAgua()).sum()
				);
	}

	@Override
	public double proporcionTierra() {
		return (
				this.getPartes().stream().mapToDouble(p -> p.proporcionTierra()).sum()
			);
	}

	public void agregarTopografia(Topografia otraTopografia) {
		if (this.getPartes().size() < 4) {
			this.getPartes().add(otraTopografia);
		}
	}
	
	@Override
	public boolean equals(Topografia otraTopografia) {
		return (
					otraTopografia.equalsMixta(this)
				);
	}
	
	@Override
	public boolean equalsMixta(TopografiaMixta otraTopografia) {
		if (this.proporcionAgua() == otraTopografia.proporcionAgua() && this.proporcionTierra() == otraTopografia.proporcionTierra()){
			for (int i = 0; i < 4; i++) {
				if (!this.getPartes().get(i).equals(otraTopografia.getPartes().get(i))) {
					return (false);
				}
			}
			return (true);
		}
		return (false);
	}
	
	private List<Topografia> getPartes(){
		return (this.partes);
	}
}
