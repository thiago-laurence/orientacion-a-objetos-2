package ar.edu.unlp.info.oo2.Ejercicio18_SubteWay;


public class BuilderVegano extends BuilderSandwich{

	@Override
	public Sandwich buildSandwich() {
		return (new Sandwich("Vegano", super.getIngredientes()));
	}

	@Override
	public void buildPan() {
		super.getIngredientes().add(new Ingrediente("Pan integral", 100));
	}

	@Override
	public void buildPrincipal() {
		super.getIngredientes().add(new Ingrediente("Milanesa de girgolas", 500));
	}

	@Override
	public void buildAderezo() {
		super.getIngredientes().add(new Ingrediente("Salsa criolla", 20));
	}

	@Override
	public void buildAdicional() {	}

}
