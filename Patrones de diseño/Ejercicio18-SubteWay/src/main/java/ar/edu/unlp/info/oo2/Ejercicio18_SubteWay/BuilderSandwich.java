package ar.edu.unlp.info.oo2.Ejercicio18_SubteWay;

import java.util.List;
import java.util.ArrayList;

public abstract class BuilderSandwich {
	private List<Ingrediente> ingredientes;
	
	public BuilderSandwich() {
		this.ingredientes = new ArrayList<Ingrediente>();
	}
	
	public abstract Sandwich buildSandwich();
	
	protected abstract void buildPan();
	protected abstract void buildPrincipal();
	protected abstract void buildAderezo();
	protected abstract void buildAdicional();
	protected List<Ingrediente> getIngredientes(){
		return (this.ingredientes);
	}
}
