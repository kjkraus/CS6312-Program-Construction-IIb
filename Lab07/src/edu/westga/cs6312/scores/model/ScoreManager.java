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
        if (testName == null || testName.length() < 2) {
            throw new IllegalArgumentException("Name must be at least 2 characters. Please try again.");
        }
        this.testName = testName;
    }
    
    /**
     * Accepts a test score to be added to the collection
     * 
     * @param		grade	score to be added to the collection
     * @precondition	grade	!=null
     * 				0 <= grade <= 100
     */
    public void addScore(Integer grade) {
        if (grade == null || grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Test scores must be an integer (0 - 100). Please try again.");
        }
	    this.testScores.add(grade);
	}

    
    /**
     * Builds and returns an output of the test scores
     * 
     * @return	a string representation of the list of test scores
     */
    public String toString() {
        if (this.testScores.isEmpty()) {
            String result = this.testName + "'s scores are:";
            result += "\n\tThere are no test scores recorded.";
            return result;
        }
        String result = this.testName + "'s scores are:";
        for (int counter = 0; counter < this.testScores.size(); counter++) {
            result += "\n\t\t" + this.testScores.get(counter);
        }
        return result;
    }
}	
