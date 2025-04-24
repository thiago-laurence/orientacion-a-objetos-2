package ar.edu.unlp.info.oo2.Ejercicio18_SubteWay;

public class SubteWay {
	private BuilderSandwich builderSandwich;
	
	public SubteWay(BuilderSandwich builder) {
		this.builderSandwich = builder;
	}
	
	public Sandwich construirSandwich() {
		this.builderSandwich.buildPan();
		this.builderSandwich.buildPrincipal();
		this.builderSandwich.buildAderezo();
		this.builderSandwich.buildAdicional();
		return (this.builderSandwich.buildSandwich());
	}
	
	public void setBuilder(BuilderSandwich builder) {
		this.builderSandwich = builder;
	}
}
