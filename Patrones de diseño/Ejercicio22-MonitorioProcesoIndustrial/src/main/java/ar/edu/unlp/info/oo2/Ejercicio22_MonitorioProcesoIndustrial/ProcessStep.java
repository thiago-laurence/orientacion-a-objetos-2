package ar.edu.unlp.info.oo2.Ejercicio22_MonitorioProcesoIndustrial;

public abstract class ProcessStep {
	private boolean result;
	
	public ProcessStep() {
		this.result = false;
	}
	
	public void execute(MixingTank tank) {
		if (this.basicExecute(tank)) {
			this.setSucess();
		}else {
			this.setFailure();
		}
	}
	
	protected abstract boolean basicExecute(MixingTank tank);
	
	public boolean isDone() {
		return (this.result);
	}
	
	private void setSucess() {
		this.result = true;
	}
	
	private void setFailure() {
		this.result = false;
	}
}
