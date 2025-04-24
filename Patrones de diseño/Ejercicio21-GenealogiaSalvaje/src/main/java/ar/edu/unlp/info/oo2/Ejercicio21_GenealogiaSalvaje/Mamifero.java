package ar.edu.unlp.info.oo2.Ejercicio21_GenealogiaSalvaje;

import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fecha_nacimiento; 
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero() {
		this.setIdentificador("");
		this.setEspecie("");
		this.setFechaNacimiento(LocalDate.now());
		this.setMadre(null);
		this.setPadre(null);
	}
	public Mamifero(String Identificador) {
		this.setIdentificador(Identificador);
		this.setEspecie("");
		this.setFechaNacimiento(LocalDate.now());
		this.setMadre(null);
		this.setPadre(null);
	}
	public Mamifero(String identificador, Mamifero padre, Mamifero madre) {
		this.setIdentificador(identificador);
		this.setEspecie("");
		this.setFechaNacimiento(LocalDate.now());
		this.setMadre(madre);
		this.setPadre(padre);
	}
	public Mamifero(Mamifero padre, Mamifero madre) {
		this.setIdentificador("");
		this.setEspecie("");
		this.setFechaNacimiento(LocalDate.now());
		this.setMadre(madre);
		this.setPadre(padre);
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void setFechaNacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	public String getIdentificador() {
		return (this.identificador);
	}
	
	public String getEspecie() {
		return (this.especie);
	}
	
	public LocalDate getFechaNacimiento() {
		return (this.fecha_nacimiento);
	}

	public Mamifero getPadre() {
		return (this.padre);
	}
	
	public void setPadre(Mamifero Padre) {
		this.padre = Padre;
	}
	public Mamifero getMadre() {
		return (this.madre);
	}

	public Mamifero getAbuelaMaterna() {
		return (this.getMadre().getMadre());
	}
	
	public Mamifero getAbueloMaterno() {
		return (this.getMadre().getPadre());
	}
	
	public Mamifero getAbueloPaterno() {
		return (this.getPadre().getPadre());
	}
	
	public Mamifero getAbuelaPaterna() {

		return (this.getPadre().getMadre());
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return (this.getPadre() == unMamifero || 
				this.getMadre() == unMamifero ||
				(this.getPadre().tieneComoAncestroA(unMamifero)) ||
				this.getMadre().tieneComoAncestroA(unMamifero));
	}
}
