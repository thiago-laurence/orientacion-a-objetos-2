package ar.edu.unlp.info.oo2.Ejercicio14_FileManager;

public class DecoratorTamano extends DecoratorFile{

	public DecoratorTamano(File file) {
		super(file);
	}
	
	@Override
	public String prettyPrint(){
		return (super.getTamano() + " - " + super.prettyPrint());
	}
}
