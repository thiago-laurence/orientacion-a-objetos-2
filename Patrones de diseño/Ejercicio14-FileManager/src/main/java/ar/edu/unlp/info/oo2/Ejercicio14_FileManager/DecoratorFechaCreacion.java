package ar.edu.unlp.info.oo2.Ejercicio14_FileManager;

public class DecoratorFechaCreacion extends DecoratorFile{

	public DecoratorFechaCreacion(File file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return (super.getFechaCreacion() + " - " + super.prettyPrint());
	}

}
