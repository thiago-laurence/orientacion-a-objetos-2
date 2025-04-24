package ar.edu.unlp.info.oo2.Ejercicio14_FileManager;

public class DecoratorPermisos extends DecoratorFile{

	public DecoratorPermisos(File file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return (super.getPermisos() + " - " + super.prettyPrint());
	}
}
