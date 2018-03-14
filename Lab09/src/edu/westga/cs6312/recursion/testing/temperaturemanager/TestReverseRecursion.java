package edu.westga.cs6312.recursion.testing.temperaturemanager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.recursion.model.TemperatureManager;

class TestReverseRecursion {

    /**
     * Test to see if reverseRecursion returns a value of 4 3 2 1
     */
    @Test
    void testReverseRecursionReturnsAStringFourThreeTwoOne() {
        TemperatureManager theTemperatureManager = new TemperatureManager();
        theTemperatureManager.addTemperature(1);
        theTemperatureManager.addTemperature(2);
        theTemperatureManager.addTemperature(3);
        theTemperatureManager.addTemperature(4);
        assertEquals("4 3 2 1", theTemperatureManager.reverseRecursion());
    }
    
    /**
     * Test to see if reverseRecursion returns a value of -91 -92 100
     */
    @Test
    void testReverseRecursionReturnsAStringNegativeNinteyOneNegativeNinetyTwoAndOneHundred() {
        TemperatureManager theTemperatureManager = new TemperatureManager();
        theTemperatureManager.addTemperature(100);
        theTemperatureManager.addTemperature(-92);
        theTemperatureManager.addTemperature(-91);
        assertEquals("-91 -92 100", theTemperatureManager.reverseRecursion());
    }
    
    /**
     * Test to see if reverseRecursion returns a value of 0 1 0 1 0
     */
    @Test
    void testReverseRecursionReturnsAStringZeroOneZeroOneZero() {
        TemperatureManager theTemperatureManager = new TemperatureManager();
        theTemperatureManager.addTemperature(0);
        theTemperatureManager.addTemperature(1);
        theTemperatureManager.addTemperature(0);
        theTemperatureManager.addTemperature(1);
        theTemperatureManager.addTemperature(0);
        assertEquals("0 1 0 1 0", theTemperatureManager.reverseRecursion());
    }
    
    /**
     * Test to see if reverseRecursion returns a value of -10 -20 -30 -40
     */
    @Test
    void testReverseRecursionReturnsAStringNegativeTenNegative20Negative30Negative40() {
        TemperatureManager theTemperatureManager = new TemperatureManager();
        theTemperatureManager.addTemperature(-40);
        theTemperatureManager.addTemperature(-30);
        theTemperatureManager.addTemperature(-20);
        theTemperatureManager.addTemperature(-10);
        assertEquals("-10 -20 -30 -40", theTemperatureManager.reverseRecursion());
    }
}
