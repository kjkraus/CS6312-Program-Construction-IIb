package edu.westga.cs6312.scores.testing.scoremanager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.scores.model.ScoreManager;

class TestCreateScoreManager {

    /**
     * Test to see if 0-parameter constructor creates ScoreManager
     */
    @Test
    void test0ParameterConstructorCreatesScoreManager() {
        ScoreManager theScoreManager = new ScoreManager();
        assertEquals("	null's scores are:\r\n" 
        	+ "	There are no test scores recorded.", theScoreManager.toString());
	
    }

}
