package edu.westga.cs6312.events.testing.regulator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.events.model.Regulator;

class TestCreateRegulator {
    
    /**
     * Test 0-parameter constructor creates a Regulator with value 0
     */
    @Test
    void testZeroParameterConstructorCreatesRegulatorWithZeroValue() {
        Regulator theRegulator = new Regulator();
        assertEquals(0, theRegulator.getCurrentRegulatorSetting());
    }

}
