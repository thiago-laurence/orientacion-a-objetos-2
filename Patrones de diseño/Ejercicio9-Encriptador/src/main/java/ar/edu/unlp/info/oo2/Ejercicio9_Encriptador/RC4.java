package ar.edu.unlp.info.oo2.Ejercicio9_Encriptador;

public class RC4 implements Encriptador{

	@Override
	public String encriptar(String mensaje) {
		return ("Mensaje encriptado en RC4 --> " + mensaje);
	}
}
