package edu.westga.cs6312.events.testing.regulator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.events.model.Regulator;

class TestDecrementRegulator {

    /**
     * Test decrement returns a value of -1
     */
    @Test
    void testDecrementReturnsAValueOfNegativeOne() {
        Regulator theRegulator = new Regulator();
        theRegulator.decrement();
        assertEquals(-1, theRegulator.getCurrentRegulatorSetting());
    }
    
    /**
     * Test decrement returns a value of -5
     */
    @Test
    void testDecrementReturnsAValueOfNegativeFive() {
        Regulator theRegulator = new Regulator();
        theRegulator.decrement();
        theRegulator.decrement();
        theRegulator.decrement();
        theRegulator.decrement();
        theRegulator.decrement();
        assertEquals(-5, theRegulator.getCurrentRegulatorSetting());
    }
    
    /**
     * Test decrement returns a value of 7
     */
    @Test
    void testDecrementReturnsAValueOfSeven() {
        Regulator theRegulator = new Regulator();
        theRegulator.setCurrentRegulatorSetting(10);
        theRegulator.decrement();
        theRegulator.decrement();
        theRegulator.decrement();
        assertEquals(7, theRegulator.getCurrentRegulatorSetting());
    }
    
    /**
     * Test decrement returns a value of 99
     */
    @Test
    void testDecrementReturnsAValueOf99() {
        Regulator theRegulator = new Regulator();
        theRegulator.setCurrentRegulatorSetting(101);
        theRegulator.decrement();
        theRegulator.decrement();
        assertEquals(99, theRegulator.getCurrentRegulatorSetting());
    }

}
