package ar.edu.unlp.info.oo2.Ejercicio1_RedSocial;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario altaUsuario(String screenName) {
		Usuario user = this.usuarios.stream().filter(u -> u.getScreenName() == screenName).findFirst().orElse(null);
		if (user == null) {
			user = new Usuario(screenName);
			this.usuarios.add(user);
		}
		return (user);
	}
	
	public boolean bajaUsuario(String screenName) {
		Usuario user = this.usuarios.stream().filter(u -> u.getScreenName() == screenName).findFirst().orElse(null);
		if (user != null) {
			this.usuarios.remove(user);
		}
		return (
					(user != null) ? true : false
				);
	}
	
	public Tweet publicarTweet(Usuario user, String texto) {
		return (user.publicarTweet(texto));
	}
	
	public Tweet reTweetear(Usuario user, String texto, Tweet twOrigen) {
		return (user.reTweetear(texto, twOrigen));
	}
	
	public boolean eliminarTweet(Usuario user, Tweet tw) {
		return (user.eliminarTweet(tw));
	}
	
	public String leerTweet(Tweet tw) {
		return (tw.mostrarTweet());
	}
}
