package ar.edu.unlp.info.oo2.Ejercicio18_SubteWay;


public class BuilderClasico extends BuilderSandwich{

	@Override
	public Sandwich buildSandwich() {
		return (new Sandwich("Clasico", super.getIngredientes()));
	}

	@Override
	public void buildPan() {
		super.getIngredientes().add(new Ingrediente("Pan brioche", 100));
	}

	@Override
	public void buildPrincipal() {
		super.getIngredientes().add(new Ingrediente("Carne de ternera", 300));
	}

	@Override
	public void buildAderezo() {
		super.getIngredientes().add(new Ingrediente("Mayonesa", 20));
	}

	@Override
	public void buildAdicional() {
		super.getIngredientes().add(new Ingrediente("Adicional de tomate", 80));
	}

}
