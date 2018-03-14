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
            result += this.listOfTemperatures.get(counter) + " ";
        }
        return result;
    }
    
    /**
     * Uses looping structure to go through the list and build the value to be returned
     * 
     * @return	the the original temperatures in the reverse order that they were added
     */
    public String reverseLoop() {
        if (this.listOfTemperatures.isEmpty()) {
            String result = "\n\tThere are no temperatures recorded.";
            return result;
        }
        String result = "";
        for (int counter = this.listOfTemperatures.size(); counter > 0; counter--) {
            result += this.listOfTemperatures.get(counter - 1) + " ";
        }
        return result;
    }
    
    /**
     * Returns the results of calling the recursive helper method, reverseHelper
     * 
     * @return	the results from the recursive method
     */
    public String reverseRecursion() {
        if (this.listOfTemperatures.isEmpty()) {
            String result = "\n\tThere are no temperatures recorded.";
            return result;
        }
        return this.reverseHelper(this.listOfTemperatures.size() - 1);
    }
    
    /**
     * Recursive method that calls upon itself to build the string of reversed temperatures
     * 
     * @param 	index	the starting point (index of the end of the list to reverse)
     * @return	the the original temperatures in the order they were added
     */
    private String reverseHelper(int index) {
        if (this.listOfTemperatures.isEmpty()) {
            String result = "\n\tThere are no temperatures recorded.";
            return result;
        }
        String result = "";
        if (index == 0) {
            result += this.listOfTemperatures.get(0);
        } else {
            result += this.listOfTemperatures.get(index) + " " + this.reverseHelper(index - 1);
        }
        return result;
    }
}
