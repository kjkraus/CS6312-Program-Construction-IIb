package edu.westga.cs6312.scores.controller;

import edu.westga.cs6312.scores.model.ScoreManager;
import edu.westga.cs6312.scores.view.ScoreTUI;

/**
 * This class will execute the input-based textual user interface.
 * 
 * @author Kent Kraus
 * @version 2018-02-21
 */
public class ScoreDriver {
    
    /**
     * This is the entry point for the application. It creates a ScoreTUI
     *   instance and executes the textual user interface.
     *   
     * @param args	Command-line arguments, not used
     */
    public static void main(String[] args) {
        ScoreManager nextTestScores = new ScoreManager();
        ScoreTUI demoTextInterface = new ScoreTUI(nextTestScores);
        demoTextInterface.run();
    }
}
