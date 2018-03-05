package edu.westga.cs6312.files.controller;

import edu.westga.cs6312.files.view.TeamTUI;

/**
 * This class will execute the input-based textual user interface.
 * 
 * @author Kent Kraus
 * @version 2018-03-04
 */
public class TeamDriver {
    
    /**
     * This is the entry point for the application. It creates a TeamTUI
     *   instance and executes the textual user interface.
     *   
     * @param args	Command-line arguments, not used
     */
    public static void main(String[] args) {
        TeamTUI demoTextInterface = new TeamTUI();
        demoTextInterface.run();
    }
}
