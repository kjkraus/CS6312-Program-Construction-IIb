package edu.westga.cs6312.graphics.testing.thermometer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import edu.westga.cs6312.graphics.model.Thermometer;
import org.junit.jupiter.api.Test;

class TestGetMaximumTemperature {

    /**
     * Test to see if getCurrentTemperature is 95
     */
    @Test
    void testGetaximumTemperatureReturnsNinetyFive() {
        Thermometer theThermometer = new Thermometer(0, 32, 95);
        assertEquals("95", theThermometer.getMaximumTemperature().toString());
    }
    
    /**
     * Test to see if getCurrentTemperature is 5
     */
    @Test
    void testGetMaximumTemperatureReturnsFive() {
        Thermometer theThermometer = new Thermometer(-10, -2, 5);
        assertEquals("5", theThermometer.getMaximumTemperature().toString());
    }
    
    /**
     * Test to see if getCurrentTemperature is 2000
     */
    @Test
    void testGetMaximumTemperatureReturnsOneThousand() {
        Thermometer theThermometer = new Thermometer(1, 99, 1000);
        assertEquals("1000", theThermometer.getMaximumTemperature().toString());
    }

}
