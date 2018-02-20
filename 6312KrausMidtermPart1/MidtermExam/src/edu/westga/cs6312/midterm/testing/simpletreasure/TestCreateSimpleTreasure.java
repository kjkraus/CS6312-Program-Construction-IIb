package edu.westga.cs6312.midterm.testing.simpletreasure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.midterm.model.SimpleTreasure;

class TestCreateSimpleTreasure {

    /**
     * Test to see if 0-parameter constructor creates a simple treasure chest
     */
    @Test
    public void test0ParameterConstructorCreatesSimpleTreasure() {
    	SimpleTreasure theSimpleTreasure = new SimpleTreasure();
    	assertEquals("with simple treasure chest holding 75 money units", theSimpleTreasure.toString());
    }
}
