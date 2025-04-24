package ar.edu.unlp.info.oo2.Ejercicio9_Encriptador;

public class Blowfish implements Encriptador{

	@Override
	public String encriptar(String mensaje) {
		return ("Mensaje encriptado en Blowfish --> " + mensaje);
	}

}
