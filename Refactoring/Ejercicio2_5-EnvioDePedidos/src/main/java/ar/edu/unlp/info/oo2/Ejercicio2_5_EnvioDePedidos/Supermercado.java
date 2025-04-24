package ar.edu.unlp.info.oo2.Ejercicio2_5_EnvioDePedidos;

import java.text.MessageFormat;

public class Supermercado {
	
	public void notificarPedido(long nroPedido, Cliente c) {
		String pattern = "Estimado cliente, se le informa que hemos recibido su pedido con número {0}, el cual será enviado a la dirección {1}";
		this.enviarNotificacion(pattern, new Object[] { nroPedido, c.getDireccion() });
	}
	
	private void enviarNotificacion(String pattern, Object[] format) {
		String notificacion = MessageFormat.format(pattern, format);
//		Podria enviar la notificacio por cualquier medio
		System.out.println(notificacion);
	}
}
