package ar.edu.unlp.info.oo2.Ejercicio11_DispositivoMovilYConexiones;

public class Dispositivo {
	private CRCStrategy crcCalculator;
	private Ringer ringer;
	private Display display;
	private Connection connection;
	
	public Dispositivo(CRCStrategy crcCalculator, Connection connection, Ringer ringer, Display display) {
		this.connection = connection;
		this.display = display;
		this.ringer = ringer;
		this.crcCalculator = crcCalculator;
	}
	
	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return (this.connection.sendData(data, crc));
	}
	
	public String conectarCon(Connection conn) {
		this.connection = conn;
		return (this.display.showBanner(this.connection.pict()) + " " + this.ringer.ringer());
	}
	
	public void configurarCRC(CRCStrategy crc) {
		this.crcCalculator = crc;
	}
}
