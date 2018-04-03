package edu.westga.cs6312.graphics.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import edu.westga.cs6312.graphics.model.Thermometer;

/**
 * This class will manage the GUI by reading the data and creating a Thermometer pane
 * 
 * @author Kent Kraus
 * @version 2018-04-01
 */
public class DrawingGUI {
    private Thermometer demoThermometer;
    private ThermometerPane demoThermometerPane;
    
    /**
     * 0-parameter constructor to create a DrawingGUI object
     */
    public DrawingGUI() {
        this.readData();
    }
    
    /**
     * Helper method to add temperatures from a file to a thermometer
     */
    private void readData() {
        File myFile = new File("temperatures.txt");
        Scanner inFile = null;
          
        try {
            inFile = new Scanner(myFile);
            while (inFile.hasNext()) {
                String input = inFile.nextLine();
                try {
                    int firstTemperature = Integer.parseInt(input);
                    int secondTemperature = Integer.parseInt(input);
                    int thirdTemperature = Integer.parseInt(input);
                    
                    int minTemp = firstTemperature;
                    int currentTemp = secondTemperature;
                    int maxTemp = thirdTemperature;
                    this.demoThermometer = new Thermometer(minTemp, currentTemp, maxTemp);
                } catch (IllegalArgumentException iae) { }
            }
            inFile.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("\n\tFile not found. Returning to main menu.");
        } catch (NumberFormatException nfe) {
            System.out.println("\n\tRead past the end of the file.");
            inFile.close();
        }
    }
    
    /**
     * Helper method to create a ThermometerPane
     */
    private void createThermometerPane() {
        this.demoThermometerPane = new ThermometerPane(this.demoThermometer);
    }
    
    /**
     * Accessor for createThermometerPane
     * 
     * @return the thermometer pane
     */
    public ThermometerPane getCurrentThermometerPane() {
        this.createThermometerPane();
        return this.demoThermometerPane;
    }  
}
