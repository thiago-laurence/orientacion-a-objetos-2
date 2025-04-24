package ar.edu.unlp.info.oo2.Ejercicio18_SubteWay;

public class BuilderVegetariano extends BuilderSandwich{
	
	@Override
	public Sandwich buildSandwich() {
		return (new Sandwich("Vegetariano", super.getIngredientes()));
	}

	@Override
	public void buildPan() {
		super.getIngredientes().add(new Ingrediente("Pan con semillas", 120));
	}

	@Override
	public void buildPrincipal() {
		super.getIngredientes().add(new Ingrediente("Provoleta grillada", 200));
	}

	@Override
	public void buildAderezo() {	}

	@Override
	public void buildAdicional() {
		super.getIngredientes().add(new Ingrediente("Berenjena al escabeche", 100));
	}
}
