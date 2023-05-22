package ar.edu.unlp.info.oo2.CodigoFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Persoonal {
	private List<Persona> personas = new ArrayList<Persona>();
	private SortedSet<String> guiaTelefonica = new TreeSet<String>();
	
	public SortedSet<String> getGuiaTelefonica(){
		return (this.guiaTelefonica);
	}
	
	public List<Persona> getPersonas(){
		return (this.personas);
	}
	
	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	
	public boolean agregarTelefono(String telefono) {
		return (this.getGuiaTelefonica().add(telefono));
	}
	
	public Persona registrarPersonaFisica(String identificador, String nombreYApellido) {
		Persona p = new PersonaFisica(nombreYApellido, identificador);
		this.asignarTelefono(p);
		return (p);
	}
	
	public Persona registrarPersonaJuridica(String identificador, String nombreYApellido) {
		Persona p = new PersonaJuridica(nombreYApellido, identificador);
		this.asignarTelefono(p);
		return (p);
	}
	
	private void asignarTelefono(Persona p) {
		String telefono = this.getGuiaTelefonica().last();
		this.getGuiaTelefonica().remove(telefono);		
		this.getPersonas().add(p);
		p.setTelefono(telefono);
	}
	
	public boolean eliminarUsuario(Persona persona) {
		if (this.existeUsuario(persona)) {
			this.getPersonas().remove(persona);
			this.getGuiaTelefonica().add(persona.getTelefono());
			return (true);
		}
		return (false);
	}
	
	public Llamada registrarLlamadaNacional(Persona emisor, Persona receptor, int duracion) {
		Llamada llamada = emisor.hacerLlamadaNacional(receptor, duracion);
		return (llamada);
	}
	
	public Llamada registrarLlamadaInternacional(Persona emisor, Persona receptor, int duracion) {
		Llamada llamada = emisor.hacerLlamadaInternacional(receptor, duracion);
		return (llamada);
	}
	
	public double calcularMontoTotalLlamadas(Persona p) {
		return (
				p.calcularCostosDeLlamadas()
				);
	}

	public int cantidadDeUsuarios() {
		return (this.getPersonas().size());
	}

	public boolean existeUsuario(Persona persona) {
		return (this.getPersonas().contains(persona));
	}
	
}