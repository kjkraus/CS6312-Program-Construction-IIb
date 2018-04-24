package edu.westga.cs6312.stock.controller;

/**
 * This class will execute the input-based textual user interface.
 * 
 * @author Kent Kraus
 * @version 2018-04-23
 */
public class StockDriver {
    
    /**
     * This is the entry point for the application/ It creates a VersionChooser
     *   and uses it to call chooseVersion
     * 
     * @param args	Command-line arguments, not used
     */
    public static void main(String[] args) {
        VersionChooser demoVersionInterface = new VersionChooser();
        demoVersionInterface.chooseVersion();
    }
}
