package edu.westga.cs6312.events.testing.regulator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.events.model.Regulator;

class TestGetCurrentRegulatorSetting {

    /**
     * Test get current regulator setting returns a value of -2
     */
    @Test
    void testGetRegualtorSettingReturnsNegativeTwoValue() {
        Regulator theRegulator = new Regulator();
        theRegulator.setCurrentRegulatorSetting(-2);
        assertEquals(-2, theRegulator.getCurrentRegulatorSetting());
    }
    
    /**
     * Test get current regulator setting returns a value of 100
     */
    @Test
    void testGetRegualtorSettingReturnsOneHundred() {
        Regulator theRegulator = new Regulator();
        theRegulator.setCurrentRegulatorSetting(101);
        theRegulator.decrement();
        assertEquals(100, theRegulator.getCurrentRegulatorSetting());
    }
    
    /**
     * Test get current regulator setting returns a value of -99
     */
    @Test
    void testGetRegualtorSettingReturnsNegativeNinetyNine() {
        Regulator theRegulator = new Regulator();
        theRegulator.setCurrentRegulatorSetting(-104);
        theRegulator.increment();
        theRegulator.increment();
        theRegulator.increment();
        theRegulator.increment();
        theRegulator.increment();
        assertEquals(-99, theRegulator.getCurrentRegulatorSetting());
    }

}
