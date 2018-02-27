package edu.westga.cs6312.scores.testing.scoremanager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.scores.model.ScoreManager;

class TestAddScore {

    /**
     * Test to see if addScore returns a value of 55
     */
    @Test
    void testAddScoreReturnsAValueOf55() {
        ScoreManager theScoreManager = new ScoreManager();
        theScoreManager.setName("ABC");
        theScoreManager.addScore(0);
        assertEquals("ABC's scores are:\r\n" 
        	+  "		0", theScoreManager.toString());
    }

}
