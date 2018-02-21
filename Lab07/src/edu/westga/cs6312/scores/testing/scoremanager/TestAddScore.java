package edu.westga.cs6312.scores.testing.scoremanager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.scores.model.ScoreManager;

class TestAddScore {

    /**
     * Test to see if addScore returns a value of 100
     */
    @Test
    void testAddScoreReturnsAValueOf100() {
        ScoreManager theScoreManager = new ScoreManager();
        theScoreManager.addScore(100);
        assertEquals("	There are no test scores recorded.", theScoreManager.toString());
    }

}
