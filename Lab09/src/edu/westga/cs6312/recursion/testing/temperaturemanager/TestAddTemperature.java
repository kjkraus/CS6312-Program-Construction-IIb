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
    
    /**
     * Test to see if addTemperature returns a value of 1
     */
    @Test
    void testAddTemperatureReturnsAStringofOne() {
        TemperatureManager theTemperatureManager = new TemperatureManager();
        theTemperatureManager.addTemperature(1);
        assertEquals("1 ", theTemperatureManager.toString());
    }
    
    /**
     * Test to see if addTemperature returns a value of -99 -99
     */
    @Test
    void testAddTemperatureReturnsAStringofNegative99Negative99() {
        TemperatureManager theTemperatureManager = new TemperatureManager();
        theTemperatureManager.addTemperature(-99);
        theTemperatureManager.addTemperature(-99);
        assertEquals("-99 -99 ", theTemperatureManager.toString());
    }
    
    /**
     * Test to see if addTemperature returns a value of 34 -10 45 -20
     */
    @Test
    void testAddTemperatureReturnsAStringof34Negative10Then45Negative20() {
        TemperatureManager theTemperatureManager = new TemperatureManager();
        theTemperatureManager.addTemperature(34);
        theTemperatureManager.addTemperature(-10);
        theTemperatureManager.addTemperature(45);
        theTemperatureManager.addTemperature(-20);
        assertEquals("34 -10 45 -20 ", theTemperatureManager.toString());
    }
}
