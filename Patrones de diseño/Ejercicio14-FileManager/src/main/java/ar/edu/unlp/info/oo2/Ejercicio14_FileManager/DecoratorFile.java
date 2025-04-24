package ar.edu.unlp.info.oo2.Ejercicio14_FileManager;

import java.time.LocalDate;

public abstract class DecoratorFile implements File{
	private File file;
	
	public DecoratorFile(File file) {
		this.file = file;
	}
	
	@Override
	public String prettyPrint() {
		return (this.getFile().prettyPrint());
	}
	 @Override
	 public String getNombre() {
		 return (this.getFile().getNombre());
	 }
	 
	 @Override
	 public String getPermisos() {
		 return (this.getFile().getPermisos());
	 }
	 
	 @Override
	 public String getExtension() {
		 return (this.getFile().getExtension());
	 }
	 
	 @Override
	 public LocalDate getFechaCreacion() {
		 return (this.getFile().getFechaCreacion());
	 }
	 
	 @Override
	 public LocalDate getFechaModificacion() {
		 return (this.getFile().getFechaModificacion());
	 }
	 
	 @Override
	 public int getTamano() {
		 return (this.getFile().getTamano());
	 }
	
	protected File getFile() {
		return (this.file);
	}
}
