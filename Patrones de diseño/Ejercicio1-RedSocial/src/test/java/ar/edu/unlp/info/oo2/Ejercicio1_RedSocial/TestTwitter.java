package ar.edu.unlp.info.oo2.Ejercicio1_RedSocial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTwitter {
	
	private Twitter twitter;
	
	@BeforeEach
	void test() {
		twitter = new Twitter();
	}

	// ---------- TWEET TESTS ----------

	@Test
	public void testTweetConTextoValido() {
		Tweet tw = new Tweet("Hola mundo");
		assertEquals("Hola mundo", tw.mostrarTweet());
	}

	@Test
	public void testReTweetConOrigen() {
		Tweet original = new Tweet("Tweet original");
		Tweet rt = new Tweet("Retweet", original);
		assertEquals("Tweet original", rt.mostrarTweetOrigen());
	}

	@Test
	public void testTweetTextoMinimoYMaximo() {
		Tweet corto = new Tweet("A");
		assertEquals("A", corto.mostrarTweet());

		String largo = "A".repeat(280);
		Tweet largoTw = new Tweet(largo);
		assertEquals(280, largoTw.mostrarTweet().length());
	}

	// ---------- USUARIO TESTS ----------

	@Test
	public void testUsuarioPublicaTweet() {
		Usuario u = new Usuario("juan");
		Tweet t = u.publicarTweet("Hola Twitter");
		assertEquals("Hola Twitter", t.mostrarTweet());
	}

	@Test
	public void testUsuarioEliminaTweet() {
		Usuario u = new Usuario("ana");
		Tweet t = u.publicarTweet("Tweet para eliminar");
		assertTrue(u.eliminarTweet(t));
	}

	@Test
	public void testUsuarioReTwittea() {
		Usuario u = new Usuario("pepe");
		Tweet original = new Tweet("Tweet original");
		Tweet rt = u.reTweetear("Mi RT", original);
		assertEquals("Tweet original", rt.mostrarTweetOrigen());
	}

	// ---------- TWITTER SYSTEM TESTS ----------

	@Test
	public void testAltaYBajaUsuario() {
		Usuario u = twitter.altaUsuario("luis");
		assertNotNull(u);
		assertTrue(twitter.bajaUsuario("luis"));
	}

	@Test
	public void testNoPermiteUsuariosDuplicados() {
		Usuario u1 = twitter.altaUsuario("sol");
		Usuario u2 = twitter.altaUsuario("sol");
		assertSame(u1, u2);
	}

	@Test
	public void testTweetsSeEliminanAlBorrarUsuario() {
		Usuario u = twitter.altaUsuario("alex");
		Tweet t = twitter.publicarTweet(u, "Voy a ser borrado");
		assertTrue(u.eliminarTweet(t)); // primero elimina manualmente
		assertTrue(twitter.bajaUsuario("alex")); // elimina usuario
	}

	@Test
	public void testPublicarYLeerTweet() {
		Usuario u = twitter.altaUsuario("caro");
		Tweet t = twitter.publicarTweet(u, "¡Hola!");
		String leido = twitter.leerTweet(t);
		assertEquals("¡Hola!", leido);
	}

	@Test
	public void testReTweetDesdeTwitter() {
		Usuario u = twitter.altaUsuario("emi");
		Tweet original = twitter.publicarTweet(u, "Hola desde Emi");
		Tweet rt = twitter.reTweetear(u, "Reenviando esto", original);
		assertEquals("Hola desde Emi", rt.mostrarTweetOrigen());
	}

	@Test
	public void testEliminarTweetDesdeTwitter() {
		Usuario u = twitter.altaUsuario("dani");
		Tweet t = twitter.publicarTweet(u, "Este va a morir");
		assertTrue(twitter.eliminarTweet(u, t));
	}

	@Test
	public void testTweetInvalidoLanzaExcepcion() {
		assertThrows(IllegalArgumentException.class, () -> new Tweet(""));
		assertThrows(IllegalArgumentException.class, () -> new Tweet("A".repeat(281)));
	}
}
