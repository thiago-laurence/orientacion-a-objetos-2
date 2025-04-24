package ar.edu.unlp.info.oo2.Ejercicio21_GenealogiaSalvaje;

import java.time.LocalDate;

public class NullMamifero extends Mamifero{

	public NullMamifero() {
		super(null, null);
		this.setFechaNacimiento(null);
	}
	
	public NullMamifero(String Identificador) {
		super();
		this.setFechaNacimiento(null);
	}
	
	@Override
	public void setIdentificador(String identificador) {	}

	@Override
	public void setEspecie(String especie) {	}

	@Override
	public void setFechaNacimiento(LocalDate fecha_nacimiento) {	}

	@Override
	public void setMadre(Mamifero madre) {	}
	
	@Override
	public Mamifero getAbuelaMaterna() {
		return (null);
	}
	
	@Override
	public Mamifero getAbueloMaterno() {
		return (null);
	}
	
	@Override
	public Mamifero getAbueloPaterno() {
		return (null);
	}
	
	@Override
	public Mamifero getAbuelaPaterna() {

		return (null);
	}
	
	@Override
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return (false);
	}
}
