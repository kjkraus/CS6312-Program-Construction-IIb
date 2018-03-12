package edu.westga.cs6312.recursion.model;

import java.util.ArrayList;

/**
 * This class models a temperature manager by keeping track of a list of 
 *   temperature values 
 * 
 * @author Kent Kraus
 * @version 2018-03-11
 */
public class TemperatureManager {
    private ArrayList<Integer> listOfTemperatures;
    
    /**
     * 0-parameter constructor to create the TemperatureManager object
     */
    public TemperatureManager() {
        this.listOfTemperatures = new ArrayList<Integer>();
    }
    
    /**
     * Will accept a temperature value to be added to the list
     * 
     * @param  currentTemperature	a temperature to be added to the temperature manager
     */
    public void addTemperature(int currentTemperature) {
        if (currentTemperature == null) {
            throw new IllegalArgumentException("Temperature cannot be null. ");
        }
    	this.listOfTemperatures.add(currentTemperature);
    }
    
    /**
     * Returns a single line describing the temperatures
     * 
     * @return	the the original temperatures in the order they were added
     */
    public String toString() {
        if (this.listOfTemperatures.isEmpty()) {
            String result = "\n\tThere are no temperatures recorded.";
            return result;
        }
        String result = "";
        for (int counter = 0; counter < this.listOfTemperatures.size(); counter++) {
            result += " " + this.listOfTemperatures.get(counter);
        }
        return result;
    }
}
