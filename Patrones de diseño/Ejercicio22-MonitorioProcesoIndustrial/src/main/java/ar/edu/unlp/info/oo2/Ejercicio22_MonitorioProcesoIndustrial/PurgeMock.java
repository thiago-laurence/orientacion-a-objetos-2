package ar.edu.unlp.info.oo2.Ejercicio22_MonitorioProcesoIndustrial;

public class PurgeMock extends Purge{
	
	@Override
	protected boolean basicExecute(MixingTank tank) {
//		return (tank.heatPower(0) && tank.mixerPower(0) && tank.purge());
		
		if (tank.upTo() == 0){
			return (false);
		}else{
			tank.heatPower(0);
			tank.mixerPower(0);
			tank.purge();
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}if (tank.upTo() != 0){
			return (false);
		}
		return (true);
				
	}
	
}
