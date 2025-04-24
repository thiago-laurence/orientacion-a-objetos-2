package ar.edu.unlp.info.oo2.Ejercicio1_RedSocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<Tweet>();
	}
	
	public Tweet publicarTweet(String texto) {
		Tweet tw = new Tweet(texto);
		this.tweets.add(tw);
		return (tw);
	}
	
	public boolean eliminarTweet(Tweet tw) {
		return (this.tweets.remove(tw));
	}
	
	public Tweet reTweetear(String texto, Tweet twOrigen) {
		Tweet tw = new Tweet(texto, twOrigen);
		this.tweets.add(tw);
		return (tw);
	}
	
	public String getScreenName() {
		return (this.screenName);
	}
}
