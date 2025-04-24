package ar.edu.unlp.info.oo2.Ejercicio9_Encriptador;

public class RSA implements Encriptador{

	@Override
	public String encriptar(String mensaje) {
		return ("Mensaje encriptado en RSA --> " + mensaje);
	}

}
