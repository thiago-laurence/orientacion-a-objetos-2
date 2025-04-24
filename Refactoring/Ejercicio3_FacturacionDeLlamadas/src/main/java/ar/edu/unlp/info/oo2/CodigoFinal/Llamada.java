package ar.edu.unlp.info.oo2.CodigoFinal;

public abstract class Llamada {
	private String telefonoEmisor;
	private String telefonoReceptor;
	private int duracion;
	
	public Llamada(String telefonoEmisor, String telefonoReceptor, int duracion) {
		this.telefonoEmisor = telefonoEmisor;
		this.telefonoReceptor = telefonoReceptor;
		this.duracion = duracion;
	}
	
	public void setEmisor(String telefonoEmisor) {
		this.telefonoEmisor = telefonoEmisor;
	}
	
	public String getReceptor() {
		return (this.telefonoReceptor);
	}
	
	public void setReceptor(String telefonoReceptor) {
		this.telefonoReceptor = telefonoReceptor;
	}
	
	public int getDuracion() {
		return (this.duracion);
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public abstract double calcularCosto();
}
