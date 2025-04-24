package ar.edu.unlp.info.oo2.Ejercicio22_MonitorioProcesoIndustrial;

public class MixingTankFake extends MixingTank{
	
	private int heatPower;
	private int mixerPower;
	private double temperature;
	private double upTo;
	
	public MixingTankFake(I2CDriver driver, double upTo) {
		super(driver);
		this.heatPower = 0;
		this.mixerPower = 0;
		this.temperature = 0;
		this.upTo = upTo;
	}

	@Override
	public boolean heatPower(int porcentage) {
		if (porcentage >= 0 && porcentage <= 100) {
			this.heatPower = porcentage;
			return (true);
		}
		return (false);
	}

	@Override
	public boolean mixerPower(int porcentage) {
		if (porcentage >= 0 && porcentage <= 100) {
			this.mixerPower = porcentage;
			return (true);
		}
		return (false);
	}

	@Override
	public boolean purge() {
		this.temperature = (upTo() > 75 && upTo() <= 100) ? (temperature() - 5) 
							: (upTo() > 50 && upTo() <= 75) ? (temperature() - 4) 
							: (upTo() > 25 && upTo() <= 50) ? (temperature() - 2)
							: (upTo() > 0 && upTo() <= 25) ? (temperature() - 1)
							: 0;
		return (upTo() == 0);
	}

	@Override
	public double upTo() {
		return (this.upTo);
	}

	@Override
	public double temperature() {
		return (this.temperature);
	}

}
