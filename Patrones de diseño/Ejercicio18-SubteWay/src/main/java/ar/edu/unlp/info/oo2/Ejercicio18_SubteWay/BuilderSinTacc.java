package ar.edu.unlp.info.oo2.Ejercicio18_SubteWay;

public class BuilderSinTacc extends BuilderSandwich{
	
	@Override
	public Sandwich buildSandwich() {
		return (new Sandwich("Sin TACC", super.getIngredientes()));
	}

	@Override
	public void buildPan() {
		super.getIngredientes().add(new Ingrediente("Pan de chipa", 150));
	}

	@Override
	public void buildPrincipal() {
		super.getIngredientes().add(new Ingrediente("Carne de pollo", 250));
	}

	@Override
	public void buildAderezo() {
		super.getIngredientes().add(new Ingrediente("Salsa tartara", 18));
	}

	@Override
	public void buildAdicional() {
		super.getIngredientes().add(new Ingrediente("Verduras grilladas", 200));
	}
}
