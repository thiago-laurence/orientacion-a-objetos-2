package ar.edu.unlp.info.oo2.Ejercicio9_Encriptador;

public class ConexionSegura extends Conexion{
	private Encriptador encrip;
	
	public ConexionSegura(Encriptador encrip) {
		this.encrip = encrip;
	}
	
	protected Encriptador getEncriptador() {
		return (this.encrip);
	}
	
	public void setEncriptador(Encriptador encrip) {
		this.encrip = encrip;
	}
	
	@Override
	public String enviar(String mensaje) {
		return  (this.getEncriptador().encriptar(mensaje));
	}

}
