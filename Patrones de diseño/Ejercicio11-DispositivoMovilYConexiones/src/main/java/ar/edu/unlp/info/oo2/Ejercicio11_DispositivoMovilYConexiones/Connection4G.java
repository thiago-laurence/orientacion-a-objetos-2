package ar.edu.unlp.info.oo2.Ejercicio11_DispositivoMovilYConexiones;

public class Connection4G {
	private String symb;
	
	public Connection4G() {
		this.symb = "4G";
	}
	
	public String getSymb() {
		return (this.symb);
	}
	
	public String transmit(String data, long crc) {
		return ("Data: " + data + " from 4GConn, CRC --> " + crc);
	}

}
