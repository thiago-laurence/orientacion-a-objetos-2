package ar.edu.unlp.info.oo2.Ejercicio22_MonitorioProcesoIndustrial;

public class LightMixMock extends LightMix{
	
	@Override
	protected boolean basicExecute(MixingTank tank) {
//		return ((tank.heatPower(20) && tank.mixerPower(5)));

		double temp = tank.temperature();
		tank.heatPower(100);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(tank.temperature() - temp == 10 ){
			tank.mixerPower(5);
			return (true);
		}else{
			return (false);
		}
	}
}
