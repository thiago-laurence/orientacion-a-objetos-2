package ar.edu.unlp.info.oo2.Ejercicio14_FileManager;

public class DecoratorNombre extends DecoratorFile{

	public DecoratorNombre(File file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return (super.getNombre()+ " - " + super.prettyPrint());
	}
}
