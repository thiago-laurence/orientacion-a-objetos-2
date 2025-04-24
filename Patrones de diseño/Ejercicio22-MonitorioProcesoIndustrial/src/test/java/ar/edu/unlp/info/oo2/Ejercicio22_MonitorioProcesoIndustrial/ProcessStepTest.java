package ar.edu.unlp.info.oo2.Ejercicio22_MonitorioProcesoIndustrial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProcessStepTest {
	ProcessStep processLightMix, processPurge;
	MixingTank tank;

	@BeforeEach
	void setUp() throws Exception {
		processLightMix = new LightMixMock();
		processPurge = new PurgeMock();
		tank = new MixingTankFake(new I2CDriver(), 100);
	}

	@Test
	void testLightMixProcess() {
//		processLightMix.execute(tank);
//		assertTrue(processLightMix.isDone());
	}

	@Test
	void testPurgeProcess() {
//		processPurge.execute(tank);
//		assertTrue(processPurge.isDone());
	}
}
