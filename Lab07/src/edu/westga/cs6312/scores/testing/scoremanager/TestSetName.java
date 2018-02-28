package edu.westga.cs6312.scores.testing.scoremanager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import edu.westga.cs6312.scores.model.ScoreManager;

class TestSetName {
    
    /**
     * Test to confirm the test name will produce a value of Test1
     */
    @Test
    void testSetNameToTest1ProducesTestNameTest1() {
        ScoreManager theScoreManager = new ScoreManager();
        theScoreManager.setName("Test 1");
        assertEquals("Test 1", theScoreManager.getTestName());
	
    }
    
    /**
     * Test to confirm the test name will produce a value of 999
     */
    @Test
    void testSetNameToTest1ProducesTestName999() {
        ScoreManager theScoreManager = new ScoreManager();
        theScoreManager.setName("999");
        assertEquals("999", theScoreManager.getTestName());	
    }
    
    /**
     * Test to confirm the test name will produce a value of abcdefghijk
     */
    @Test
    void testSetNameToTest1ProducesTestNameabcdefghijk() {
        ScoreManager theScoreManager = new ScoreManager();
        theScoreManager.setName("abcdefghijk");
        assertEquals("abcdefghijk", theScoreManager.getTestName());	
	
    }
    
    /**
     * Test to confirm the test name will produce a value of Money$$99
     */
    @Test
    void testSetNameToTest1ProducesTestNameMoneyDollars99() {
        ScoreManager theScoreManager = new ScoreManager();
        theScoreManager.setName("Money$$99");
        assertEquals("Money$$99", theScoreManager.getTestName());	
	
    }

}
