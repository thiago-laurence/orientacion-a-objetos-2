package ar.edu.unlp.info.oo2.Ejercicio2_3_Publicaciones;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PostApp {
	private List<Post> posts;
	
	public PostApp() {
		this.posts = new ArrayList<Post>();
	}
	
	public List<Post> ultimosPostDistintoAUsuario(Usuario user, int cantidad){
		List<Post> result = this.getPostDistintoAUsuario(this.posts, user);
		this.ordernarPostPorFecha(result);
		this.getNPrimerosPost(result, cantidad);
		return (result);
	}
	
	private List<Post> getPostDistintoAUsuario(List<Post> otrosPost, Usuario user){
		return (
				otrosPost.stream().filter(p -> p.getUsuario() != user)
				.collect(Collectors.toList())
				);
	}
	
	private List<Post> ordernarPostPorFecha(List<Post> otrosPost){
		return (
				otrosPost.stream()
				.sorted((p1, p2) -> p1.getFecha().compareTo(p2.getFecha()))
				.collect(Collectors.toList())
				);
	}
	
	private List<Post> getNPrimerosPost(List<Post> otrosPost, int n){
		return(
				otrosPost.stream().limit(n)
				.collect(Collectors.toList())
				);
	}
}
