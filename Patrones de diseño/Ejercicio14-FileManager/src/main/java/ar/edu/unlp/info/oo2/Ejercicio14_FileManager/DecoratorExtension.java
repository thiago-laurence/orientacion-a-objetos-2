package ar.edu.unlp.info.oo2.Ejercicio14_FileManager;

public class DecoratorExtension extends DecoratorFile{

	public DecoratorExtension(File file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return (super.getExtension() + " - " + super.prettyPrint());
	}
}
