package edu.westga.cs6312.scores.testing.scoremanager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.scores.model.ScoreManager;

class TestAddScore {

    /**
     * Test to see if addScore returns a value of 0
     */
    @Test
    void testAddScoreReturnsAValueOfZero() {
        ScoreManager theScoreManager = new ScoreManager();
        theScoreManager.addScore(0);
        assertEquals("0", theScoreManager.getTestScore(0).toString()); 
    }
    
    /**
     * Test to see if addScore returns a value of 1
     */
    @Test
    void testAddScoreReturnsAValueOf1() {
        ScoreManager theScoreManager = new ScoreManager();
        theScoreManager.addScore(1);
        assertEquals("1", theScoreManager.getTestScore(0).toString()); 
    }
    
    /**
     * Test to see if addScore returns a value of 99
     */
    @Test
    void testAddScoreReturnsAValueOf99() {
        ScoreManager theScoreManager = new ScoreManager();
        theScoreManager.addScore(99);
        assertEquals("99", theScoreManager.getTestScore(0).toString()); 
    }
    
    /**
     * Test to see if addScore returns a value of 100
     */
    @Test
    void testAddScoreReturnsAValueOf100() {
        ScoreManager theScoreManager = new ScoreManager();
        theScoreManager.addScore(100);
        assertEquals("100", theScoreManager.getTestScore(0).toString()); 
    }
    
    /**
     * Test to see if addScore returns a value of 55
     */
    @Test
    void testAddScoreReturnsAValueOf55() {
        ScoreManager theScoreManager = new ScoreManager();
        theScoreManager.addScore(55);
        assertEquals("55", theScoreManager.getTestScore(0).toString());
    }

}
