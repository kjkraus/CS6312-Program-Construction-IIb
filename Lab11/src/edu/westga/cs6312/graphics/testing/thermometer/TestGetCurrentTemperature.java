package edu.westga.cs6312.graphics.testing.thermometer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import edu.westga.cs6312.graphics.model.Thermometer;
import org.junit.jupiter.api.Test;

class TestGetCurrentTemperature {

    /**
     * Test to see if getCurrentTemperature is 95
     */
    @Test
    void testGetCurrentTemperatureReturnsNinetyFive() {
        Thermometer theThermometer = new Thermometer(0, 0, 95);
        assertEquals("95", theThermometer.getCurrentTemperature().toString());
    }
    
    /**
     * Test to see if getCurrentTemperature is -199
     */
    @Test
    void testGetCurrentTemperatureReturnsNegativeOneNinetyNine() {
        Thermometer theThermometer = new Thermometer(-10, 5, -199);
        assertEquals("-199", theThermometer.getCurrentTemperature().toString());
    }
    
    /**
     * Test to see if getCurrentTemperature is 2000
     */
    @Test
    void testGetCurrentTemperatureReturnsTwoThousand() {
        Thermometer theThermometer = new Thermometer(1, 1, 2000);
        assertEquals("2000", theThermometer.getCurrentTemperature().toString());
    }
}
