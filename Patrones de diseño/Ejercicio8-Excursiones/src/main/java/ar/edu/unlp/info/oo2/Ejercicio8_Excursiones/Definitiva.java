package ar.edu.unlp.info.oo2.Ejercicio8_Excursiones;

public class Definitiva extends ExcursionState{

	@Override
	public void inscribir(Excursion exc, Usuario user) {
		exc.getInscriptos().add(user);
		if (exc.getInscriptos().size() == exc.getCupoMax()) {
			exc.changeState(new Completa());
		}
	}

	@Override
	public String obtenerInfo(Excursion exc) {
		StringBuilder stb = new StringBuilder(
				super.obtenerInfo(exc) + 
				"Cant. de usuarios para cupo maximo: " + (exc.getCupoMax() - exc.getInscriptos().size()) + "\n" + 
				"Email de inscriptos hasta el momento: \n");
		exc.getInscriptos().forEach(u -> stb.append(u.getEmail() + "\n"));
		return (stb.toString());
	}

}
