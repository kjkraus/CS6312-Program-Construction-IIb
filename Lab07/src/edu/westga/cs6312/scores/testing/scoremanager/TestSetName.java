package edu.westga.cs6312.scores.testing.scoremanager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import edu.westga.cs6312.scores.model.ScoreManager;

class TestSetName {
    
    /**
     * Test to confirm the test name will produce a value of Test 1
     */
    @Test
    void testSetNameToTest1ProducesTest1() {
        ScoreManager theScoreManager = new ScoreManager();
        theScoreManager.setName("Test 1");
        assertEquals("Test 1", theScoreManager.toString());
	
    }

}
