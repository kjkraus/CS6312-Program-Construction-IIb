package edu.westga.cs6312.graphics.view;

import edu.westga.cs6312.graphics.model.Thermometer;
import javafx.scene.layout.Pane;

/**
 * This class will manage the code that draws the Thermometer
 * 
 * @author Kent Kraus
 * @version 2018-04-01
 */
public class ThermometerPane extends Pane {
    private Thermometer demoThermometer;
    
    /**
     * 1-parameter constructor that accepts a Thermometer
     * 
     * @param givenThermometer	Thermometer with the data for the drawing
     */
    public ThermometerPane(Thermometer givenThermometer) {
        this.demoThermometer = givenThermometer;
    }
    
    /**
     * Helper method to draw the thermometer
     */
    public void drawThermometer() {
	
    }
}
