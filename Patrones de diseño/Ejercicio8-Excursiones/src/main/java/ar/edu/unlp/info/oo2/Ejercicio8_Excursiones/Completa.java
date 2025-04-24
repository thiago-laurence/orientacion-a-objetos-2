package ar.edu.unlp.info.oo2.Ejercicio8_Excursiones;

public class Completa extends ExcursionState{

	@Override
	public void inscribir(Excursion exc, Usuario user) {
		exc.getListaEnEspera().add(user);
	}

	@Override
	public String obtenerInfo(Excursion exc) {
		return (
					super.obtenerInfo(exc)
				);
	}

}
