package edu.westga.cs6312.midterm.testing.randomtreasure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.midterm.model.RandomTreasure;

class TestCreateRandomTreasure {

    /**
     * Test to see if 1-parameter constructor creates a random treasure chest
     */
    @Test
    public void test1ParameterConstructorCreatesRandomTreasure() {
    	Random random = null;
    	RandomTreasure theRandomTreasure = new RandomTreasure(random);
    	assertEquals("with random treasure chest holding 100 money units", theRandomTreasure.toString());
    }

}
