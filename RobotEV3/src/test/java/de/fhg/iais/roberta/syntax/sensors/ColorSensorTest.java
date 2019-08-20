package de.fhg.iais.roberta.syntax.sensors;

import org.junit.Test;

import de.fhg.iais.roberta.util.test.ev3.HelperEv3ForXmlTest;

public class ColorSensorTest {
    private final HelperEv3ForXmlTest h = new HelperEv3ForXmlTest();

    @Test
    public void setColor() throws Exception {
        String a =
            "\nhal.getColorSensorColour(SensorPort.S3)"
                + "hal.getColorSensorRed(SensorPort.S3)"
                + "hal.getColorSensorRgb(SensorPort.S3)"
                + "hal.getColorSensorAmbient(SensorPort.S3)}";

        this.h.assertCodeIsOk(a, "/syntax/sensors/sensor_setColor.xml");
    }
}
