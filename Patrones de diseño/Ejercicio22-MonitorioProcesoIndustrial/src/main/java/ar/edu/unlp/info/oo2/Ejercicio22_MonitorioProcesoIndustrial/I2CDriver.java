package ar.edu.unlp.info.oo2.Ejercicio22_MonitorioProcesoIndustrial;

public class I2CDriver {
	private int SCL;
	private int SDL;
	
	public I2CDriver() {  }
	
	public I2CDriver(int scl, int sdl) {
		this.SCL = scl;
		this.SDL = sdl;
	}
	
	public boolean sendStartSeq() {
		
	}
	
	public boolean sendAddress(String address) {
		
	}
	
	public boolean sendCommand(String command) {
		
	}
	
	public boolean sendStopSeq() {
		
	}
}
