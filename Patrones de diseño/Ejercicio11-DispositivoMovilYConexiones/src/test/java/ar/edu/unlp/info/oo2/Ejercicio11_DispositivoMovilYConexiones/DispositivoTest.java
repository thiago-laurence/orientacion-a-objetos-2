package ar.edu.unlp.info.oo2.Ejercicio11_DispositivoMovilYConexiones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DispositivoTest {
	Dispositivo disp;

	@BeforeEach
	void setUp() throws Exception {
		disp = new Dispositivo(new CRC16_Calculator(), new WifiConn(), new Ringer(), new Display());
	}

	@Test
	void testSend() {
		String data = "Hola mundo!";
		String dataCrc16 = disp.send(data);
		disp.configurarCRC(new CRC32_Calculator());
		String dataCrc32 = disp.send(data);
		assertNotEquals(dataCrc16, dataCrc32);
	}
	
	@Test
	void testconectarCon() {
		String WifiConn = disp.conectarCon(new WifiConn());
		String Conn4G = disp.conectarCon(new Adapter4G());
		assertNotEquals(WifiConn, Conn4G);
		System.out.println(WifiConn + " - " + Conn4G);
	}
}
