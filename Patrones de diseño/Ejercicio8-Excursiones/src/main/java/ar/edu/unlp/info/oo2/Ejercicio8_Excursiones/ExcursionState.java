package ar.edu.unlp.info.oo2.Ejercicio8_Excursiones;

public abstract class ExcursionState {
	
	public abstract void inscribir(Excursion exc, Usuario user);
	
	public String obtenerInfo(Excursion exc) {
		return (
					"Nombre de la excursion: " + exc.getNombre() + "\n" + 
					"Costo: " + exc.getCosto() + "\n" +
					"Fecha de inicio: " + exc.getFechaInicio() + "\n" + 
					"Fecha de fin: " + exc.getFechaFin() + "\n" + 
					"Punto de encuentro: " + exc.getPuntoEncuentro() + "\n"
				);
	}
}
