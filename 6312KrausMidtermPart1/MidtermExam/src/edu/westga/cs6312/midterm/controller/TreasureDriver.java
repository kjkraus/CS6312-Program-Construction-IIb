package edu.westga.cs6312.midterm.controller;

import edu.westga.cs6312.midterm.model.GameBoard;
import edu.westga.cs6312.midterm.view.TreasureTUI;

/**
 * This class will execute the input-based textual user interface.
 * 
 * @author Kent Kraus
 * @version 2018-02-18
 */
public class TreasureDriver {
    
    /**
     * This is the entry point for the application. It creates a TreasureTUI
     *   instance and executes the textual user interface.
     *   
     * @param args	Command-line arguments, not used
     */
    public static void main(String[] args) {
        GameBoard nextMap = new GameBoard();
        TreasureTUI demoTextInterface = new TreasureTUI(nextMap);
        demoTextInterface.run();

    }

}
