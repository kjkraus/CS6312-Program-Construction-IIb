package edu.westga.cs6312.recursion.controller;

import edu.westga.cs6312.recursion.model.TemperatureManager;
import edu.westga.cs6312.recursion.view.TemperatureTUI;

/**
 * This class will execute the input-based textual user interface.
 * 
 * @author Kent Kraus
 * @version 2018-03-11
 */
public class TemperatureDriver {
    
    /**
     * This is the entry point for the application. It creates a TemperatureTUI
     *   instance and executes the textual user interface.
     *   
     * @param args	Command-line arguments, not used
     */
    public static void main(String[] args) {
        TemperatureManager currentTemperatures = new TemperatureManager();
        TemperatureTUI demoTextInterface = new TemperatureTUI(currentTemperatures);
        demoTextInterface.run();
    }
}
