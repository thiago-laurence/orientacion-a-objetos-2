package ar.edu.unlp.info.oo2.Ejercicio5_FileSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio extends FSComponent{
	private List<FSComponent> componentes;
	
	public Directorio(String nombre, LocalDate fechaCreacion) {
		super(nombre, fechaCreacion, 32);
		this.componentes = new ArrayList<FSComponent>();
	}

	@Override
	public int tamanoTotalOcupado() {
		return (
					this.componentes.stream()
					.mapToInt(c -> c.tamanoTotalOcupado())
					.sum()
					+
					this.getTamano()
				);
	}
	
	public void agregar(FSComponent component) {
		this.componentes.add(component);
	}

	public Archivo archivoMasNuevo() {
		List<Archivo> l = this.componentes.stream()
											.map(c -> c.archivoMasNuevo())
											.sorted(Comparator.comparing(FSComponent::getFechaCreacion).reversed())
											.collect(Collectors.toList());
		return ((l.size() != 0) ? l.get(0) : null);
	}
	
	public Archivo archivoMasGrande() {
		return (
					this.componentes.stream()
					.map(c -> c.archivoMasGrande())
					.max((a1, a2) -> Integer.compare(a1.getTamano(), a2.getTamano()))
					.orElse(null)
				);
	}
}
