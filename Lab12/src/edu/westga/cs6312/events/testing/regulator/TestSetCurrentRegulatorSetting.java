package edu.westga.cs6312.events.testing.regulator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.events.model.Regulator;

class TestSetCurrentRegulatorSetting {

    /**
     * Test get current regulator setting returns a value of -10
     */
    @Test
    void testGetRegulatorWithNegativeTenValue() {
        Regulator theRegulator = new Regulator();
        theRegulator.setCurrentRegulatorSetting(-10);
        assertEquals(-10, theRegulator.getCurrentRegulatorSetting());
    }
    
    /**
     * Test get current regulator setting returns a value of 2
     */
    @Test
    void testGetRegulatorWithValueOfTwo() {
        Regulator theRegulator = new Regulator();
        theRegulator.increment();
        theRegulator.increment();
        assertEquals(2, theRegulator.getCurrentRegulatorSetting());
    }
    
    /**
     * Test get current regulator setting returns a value of 0
     */
    @Test
    void testGetRegulatorWithValueOfZero() {
        Regulator theRegulator = new Regulator();
        theRegulator.setCurrentRegulatorSetting(2);
        theRegulator.decrement();
        theRegulator.decrement();
        assertEquals(0, theRegulator.getCurrentRegulatorSetting());
    }

}
