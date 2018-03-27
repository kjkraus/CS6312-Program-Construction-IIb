package edu.westga.cs6312.sorting.controller;

import edu.westga.cs6312.sorting.view.SortTUI;

/**
 * This class will execute the input-based textual user interface.
 * 
 * @author Kent Kraus
 * @version 2018-03-26
 */
public class SortDriver {
    /**
     * This is the entry point for the application. It creates a SortTUI
     *   instance and executes the textual user interface.
     *   
     * @param args	Command-line arguments, not used
     */
    public static void main(String[] args) {
        SortTUI demoTextInterface = new SortTUI();
        demoTextInterface.run();
    }
}
