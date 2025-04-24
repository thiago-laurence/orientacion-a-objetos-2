package ar.edu.unlp.info.oo2.Ejercicio1_RedSocial;

public class Tweet {
	private String texto;
	private Tweet twOrigen;

	public Tweet(String texto) {
		if (texto == null || texto.length() < 1 || texto.length() > 280)
			throw new IllegalArgumentException("Texto fuera de rango permitido");

		this.texto = texto;
		this.twOrigen = null;
	}
	
	public Tweet(String texto, Tweet twOrigen) {
		this.texto = texto;
		this.twOrigen = twOrigen;
	}
	
	public String mostrarTweet() {
		return (this.getTexto());
	}
	
	public String mostrarTweetOrigen() {
		return (this.getTweetOrigen().mostrarTweet());
	}
	
	private Tweet getTweetOrigen() {
		return (this.twOrigen);
	}
	
	private String getTexto() {
		return (this.texto);
	}
}
