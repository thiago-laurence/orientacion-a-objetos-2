package ar.edu.unlp.info.oo2.Ejercicio22_MonitorioProcesoIndustrial;

public abstract class MixingTank {
	private I2CDriver driver;
	
	public MixingTank(I2CDriver driver) {
		this.driver = driver;
	}
	
	public abstract boolean heatPower(int porcentage);
	
	public abstract boolean mixerPower(int porcetage);
	
	public abstract boolean purge();
	
	public abstract double upTo();
	
	public abstract double temperature();
}
