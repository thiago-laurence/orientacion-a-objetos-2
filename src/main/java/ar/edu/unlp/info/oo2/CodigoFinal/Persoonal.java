package ar.edu.unlp.info.oo2.CodigoFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Persoonal {
	private List<Persona> lista1 = new ArrayList<Persona>();
	private List<Llamada> lista2 = new ArrayList<Llamada>(); 
	private SortedSet<String> guia = new TreeSet<String>();
	static double descuentoJur = 0.15;
	static double descuentoFis = 0;
	
	public boolean agregarTelefono(String str) { // Si el nro no esta en la guia, lo agrega como nuevo nro disponible 
		if (this.getGuia().contains(str)) {
			this.getGuia().add(str);
			return (true);
		}
		return (false);
	}
	
	public List<Persona> getLista1() {
		return (lista1);
	}

	public void setLista1(List<Persona> lista1) {
		this.lista1 = lista1;
	}

	public List<Llamada> getLista2() {
		return (lista2);
	}

	public void setLista2(List<Llamada> lista2) {
		this.lista2 = lista2;
	}

	public SortedSet<String> getGuia() {
		return (this.guia);
	}

	public void setGuia(SortedSet<String> guia) {
		this.guia = guia;
	}

	public Persona registrarPersonaFisica(String data, String nombre) {
		PersonaFisica p = new PersonaFisica(nombre);
		p.setDni(data);
		this.registrarDatos(p);
		return (p);
	}
	
	public Persona registrarPersonaJuridica(String data, String nombre) {
		PersonaJuridica p = new PersonaJuridica(nombre);
		p.setCuit(data);
		this.registrarDatos(p);
		return (p);
	}
	
	private void registrarDatos(Persona p) {
		String telefono = this.getGuia().last();
		this.guia.remove(telefono);
		p.setTelefono(telefono);
		this.getLista1().add(p);
	}
	
	public boolean eliminarUsuario(Persoona p) {
		List<Persoona> l = p.sis.lista1.stream().filter(persona -> persona != p).collect(Collectors.toList());
		boolean borre = false;
		if (l.size() < lista1.size()) { // Si l tiene menos personas que la lista original, es porque existe, entonces la elimina y vuelve a poner el nro como disponible
			this.lista1 = l;
			this.guia.add(p.getTel());
			borre = true;
		}
		return borre;
		
	}
//	q persona emisora de la llamda, q2 persona receptora de la llamada, t el tipo de llamada (nacional o inter.) y d la duracion
	public Llamada registrarLlamada(Persoona q, Persoona q2, String t, int d) {
		Llamada x = new Llamada();
		x.tipoDeLlamada = t;
		x.setEmisor(q.tel);
		x.setRemitente(q2.getTel());
		x.dur= d;
		lista2.add(x);
		q.lista1.add(x);
		return x;
		
	}
//	Busca una persona con el mismo nro telefonico, cuando la encuntra itera sobre sus llamadas calculando los costos
	public double calcularMontoTotalLlamadas(Persoona p) {
		double c = 0;
		Persoona aux = null;
		for (Persoona pp : lista1) {
			if (pp.tel == p.getTel()) {
				aux = pp;
				break;
			}
		} if (aux == null) return c;
		if (aux != null) {
			for (Llamada l : aux.lista1) {
				double auxc = 0;
				if (l.tipoDeLlamada == "nacional") {
					auxc += l.dur *3 + (l.dur*3*0.21);
				} else if (l.tipoDeLlamada == "internacional") {
					auxc += l.dur *200 + (l.dur*200*0.21);
				}
				
				if (aux.t == "fisica") {
					auxc -= auxc*descuentoFis;
				} else if(aux.t == "juridica") {
					auxc -= auxc*descuentoJur;
				}
				c += auxc;
			}
		}
		return c;
	}

	public int cantidadDeUsuarios() {
		return lista1.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return lista1.contains(persona);
	}
}
