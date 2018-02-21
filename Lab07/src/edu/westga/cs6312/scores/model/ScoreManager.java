package edu.westga.cs6312.scores.model;

import java.util.ArrayList;

/**
 * This class models a test score manager to keep track of test scores
 * 
 * @author Kent Kraus
 * @version 2018-02-21
 */
public class ScoreManager {
    private ArrayList<Integer> testScores;
    private String testName;
    
    /**
     * 0-parameter constructor to create a test score manager
     */
    public ScoreManager() {
        this.testScores = new ArrayList<Integer>();
    }
    
    /**
     * Sets the name of the test
     * 
     * @param		testName	the test name
     * @precondition	testName != null
     * 			must contain at least 2 characters
     */
    public void setName(String testName) {
        this.testName = testName;
    }
    
    /**
     * Accepts a test score to be added to the collection
     * 
     * @param	grade	score to be added to the collection
     */
    public void addScore(int grade) {

	    this.testScores.add(grade);
	}

    
    /**
     * Builds and returns an output of the test scores
     * 
     * @return	a string representation of the list of test scores
     */
    public String toString() {
        if (this.testScores.isEmpty()) {
            return "\tThere are no test scores recorded.";
        }
        String result = this.testName + "'s scores are:";
        for (int score : this.testScores) {
            result += this.testScores.get(score) + "\n";
        }
        return result;
    }
}	
