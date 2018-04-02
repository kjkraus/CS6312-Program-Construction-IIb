package edu.westga.cs6312.graphics.testing.thermometer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import edu.westga.cs6312.graphics.model.Thermometer;
import org.junit.jupiter.api.Test;

class TestGetMinimumTemperature {

    /**
     * Test to see if getMinimumTemperature is -10
     */
    @Test
    void testGetMinimumTemperatureReturnsNegativeTen() {
        Thermometer theThermometer = new Thermometer(-10, 95, 32);
        assertEquals("-10", theThermometer.getMinimumTemperature().toString());
    }
    
    /**
     * Test to see if getMinimumTemperature is -10
     */
    @Test
    void testGetMinimumTemperatureReturnsNegativeFiveHundred() {
        Thermometer theThermometer = new Thermometer(-500, 102, 232);
        assertEquals("-500", theThermometer.getMinimumTemperature().toString());
    }
    
    /**
     * Test to see if getMinimumTemperature is 100
     */
    @Test
    void testGetMinimumTemperatureReturnsOneHundred() {
        Thermometer theThermometer = new Thermometer(100, 999, 599);
        assertEquals("100", theThermometer.getMinimumTemperature().toString());
    }

}
