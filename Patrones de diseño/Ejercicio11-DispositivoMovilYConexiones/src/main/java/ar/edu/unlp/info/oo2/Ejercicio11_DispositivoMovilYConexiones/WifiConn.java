package ar.edu.unlp.info.oo2.Ejercicio11_DispositivoMovilYConexiones;

public class WifiConn implements Connection{
	private String pict;
	
	public WifiConn() {
		this.pict = "Wifi";
	}

	@Override
	public String sendData(String data, long crc) {
		return ("Data: " + data + " from WifiConn, CRC --> " + crc);
	}

	@Override
	public String pict() {
		return (this.pict);
	}
}
