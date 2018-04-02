package edu.westga.cs6312.graphics.testing.thermometer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.graphics.model.Thermometer;

class TestCreateThermometer {

    /**
     * Test to see if 3-parameter constructor creates Thermometer with 0, 0, 0
     */
    @Test
    void test3ParamterContrcutorCreatesThermometerWithZeroForAllTemperatures() {
        Thermometer theThermometer = new Thermometer(0, 0, 0);
        assertEquals("0 0 0", theThermometer.toString());
	
    }
    
    /**
     * Test to see if 3-parameter constructor creates Thermometer with 22, 99, 1001
     */
    @Test
    void test3ParamterContrcutorCreatesThermometerWithTwentyTwoNinetyNineAndOneThousandOneTemperatures() {
        Thermometer theThermometer = new Thermometer(22, 99, 1001);
        assertEquals("22 99 1001", theThermometer.toString());
	
    }
    
    /**
     * Test to see if 3-parameter constructor creates Thermometer with 2, 32, 88
     */
    @Test
    void test3ParamterContrcutorCreatesThermometerWithTwoThirtyTwoAndEightyEightTemperatures() {
        Thermometer theThermometer = new Thermometer(2, 32, 88);
        assertEquals("2 32 88", theThermometer.toString());
	
    }

}
