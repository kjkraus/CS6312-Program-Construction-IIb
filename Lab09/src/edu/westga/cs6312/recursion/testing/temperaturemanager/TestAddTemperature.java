package edu.westga.cs6312.recursion.testing.temperaturemanager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.recursion.model.TemperatureManager;

class TestAddTemperature {

    /**
     * Test to see if addTemperature returns a value of 0 0 0
     */
    @Test
    void testAddTemperatureReturnsAStringofZeroZeroZero() {
        TemperatureManager theTemperatureManager = new TemperatureManager();
        theTemperatureManager.addTemperature(0);
        theTemperatureManager.addTemperature(0);
        theTemperatureManager.addTemperature(0);
        assertEquals("0 0 0 ", theTemperatureManager.toString());
    }

}
