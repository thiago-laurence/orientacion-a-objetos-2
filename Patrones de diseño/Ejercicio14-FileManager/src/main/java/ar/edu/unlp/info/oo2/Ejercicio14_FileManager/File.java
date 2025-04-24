package ar.edu.unlp.info.oo2.Ejercicio14_FileManager;

import java.time.LocalDate;

public interface File {
	public String prettyPrint();
	public String getNombre();
	public String getPermisos();
	public String getExtension();
	public int getTamano();
	public LocalDate getFechaCreacion();
	public LocalDate getFechaModificacion();
}
