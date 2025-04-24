package ar.edu.unlp.info.oo2.Ejercicio8_Excursiones;

public class Provisoria extends ExcursionState{

	@Override
	public void inscribir(Excursion exc, Usuario user) {
		exc.getInscriptos().add(user);
		if (exc.getInscriptos().size() == exc.getCupoMin()) {
			exc.changeState(new Definitiva());
		}
	}

	@Override
	public String obtenerInfo(Excursion exc) {
		return (
					super.obtenerInfo(exc) +  
					"Cant. de usuarios para cupo minimo: " + (exc.getCupoMin() - exc.getInscriptos().size()) + "\n" 
				);
	}

}
