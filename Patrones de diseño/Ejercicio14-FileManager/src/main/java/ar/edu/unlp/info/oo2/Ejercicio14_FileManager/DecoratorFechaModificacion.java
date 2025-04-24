package ar.edu.unlp.info.oo2.Ejercicio14_FileManager;

public class DecoratorFechaModificacion extends DecoratorFile{

	public DecoratorFechaModificacion(File file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return (super.getFechaModificacion() + " - " + super.prettyPrint());
	}

}
