package ar.edu.unlp.info.oo2.Ejercicio20_AerolineaRegional;

public class CuadroTarifario {
	private double[] rateDiario;
	private double rateRoundTrip;
	private double rateMultiHop;
	
	public CuadroTarifario(double[] rateDiario, double rateRoundTrip, double rateMultiHop) {
		this.rateDiario = rateDiario;
		this.rateRoundTrip = rateRoundTrip;
		this.rateMultiHop = rateMultiHop;
	}
	
	public double[] getRateDiario() {
		return (this.rateDiario.clone());
	}
	
	public double getRateDiarioEnDia(int dia) {
		return (this.rateDiario[dia]);
	}
	
	public double rateRoundTrip() {
		return (this.rateRoundTrip);
	}
	
	public double rateMultiHop() {
		return (this.rateMultiHop);
	}
}
