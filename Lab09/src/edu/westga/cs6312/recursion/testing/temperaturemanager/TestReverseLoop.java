package edu.westga.cs6312.recursion.testing.temperaturemanager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.recursion.model.TemperatureManager;

class TestReverseLoop {

    /**
     * Test to see if reverseLoop returns a value of 4 3 2 1
     */
    @Test
    void testReverseLoopReturnsAStringFourThreeTwoOne() {
        TemperatureManager theTemperatureManager = new TemperatureManager();
        theTemperatureManager.addTemperature(1);
        theTemperatureManager.addTemperature(2);
        theTemperatureManager.addTemperature(3);
        theTemperatureManager.addTemperature(4);
        assertEquals("4 3 2 1 ", theTemperatureManager.reverseLoop());
    }
    
    /**
     * Test to see if reverseLoop returns a value of 0 0 1 
     */
    @Test
    void testReverseLoopReturnsAStringZeroZeroOne() {
        TemperatureManager theTemperatureManager = new TemperatureManager();
        theTemperatureManager.addTemperature(1);
        theTemperatureManager.addTemperature(0);
        theTemperatureManager.addTemperature(0);
        assertEquals("0 0 1 ", theTemperatureManager.reverseLoop());
    }
    
    /**
     * Test to see if reverseLoop returns a value of 1001 999 -5 -10 
     */
    @Test
    void testReverseLoopReturnsAsStringOneThousanOneNineHundredNinetyNineNegativeFiveMegativeTen() {
        TemperatureManager theTemperatureManager = new TemperatureManager();
        theTemperatureManager.addTemperature(-5);
        theTemperatureManager.addTemperature(-10);
        theTemperatureManager.addTemperature(999);
        theTemperatureManager.addTemperature(1001);
        assertEquals("1001 999 -10 -5 ", theTemperatureManager.reverseLoop());
    }
    
    /**
     * Test to see if reverseLoop returns a value of 12345 67890 
     */
    @Test
    void testReverseLoopReturnsAsStringOneThroughFiveSpaceSixThroughZero() {
        TemperatureManager theTemperatureManager = new TemperatureManager();
        theTemperatureManager.addTemperature(67890);
        theTemperatureManager.addTemperature(12345);
        assertEquals("12345 67890 ", theTemperatureManager.reverseLoop());
    }
}
