package edu.westga.cs6312.events.testing.regulator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.events.model.Regulator;

class TestIncrementRegulator {

    /**
     * Test increment returns a value of 1
     */
    @Test
    void testIncrementReturnsAValueOfOne() {
        Regulator theRegulator = new Regulator();
        theRegulator.increment();
        assertEquals(1, theRegulator.getCurrentRegulatorSetting());
    }
    
    /**
     * Test increment returns a value of 6
     */
    @Test
    void testIncrementReturnsAValueOfSix() {
        Regulator theRegulator = new Regulator();
        theRegulator.increment();
        theRegulator.increment();
        theRegulator.increment();
        theRegulator.increment();
        theRegulator.increment();
        theRegulator.increment();
        assertEquals(6, theRegulator.getCurrentRegulatorSetting());
    }
    
    /**
     * Test increment returns a value of -1
     */
    @Test
    void testIncrementReturnsAValueOfNegativeOne() {
        Regulator theRegulator = new Regulator();
        theRegulator.setCurrentRegulatorSetting(-6);
        theRegulator.increment();
        theRegulator.increment();
        theRegulator.increment();
        theRegulator.increment();
        theRegulator.increment();
        assertEquals(-1, theRegulator.getCurrentRegulatorSetting());
    }
    
    /**
     * Test increment returns a value of 0
     */
    @Test
    void testIncrementReturnsAValueOfZero() {
        Regulator theRegulator = new Regulator();
        theRegulator.setCurrentRegulatorSetting(-3);
        theRegulator.increment();
        theRegulator.increment();
        theRegulator.increment();
        assertEquals(0, theRegulator.getCurrentRegulatorSetting());
    }

}
