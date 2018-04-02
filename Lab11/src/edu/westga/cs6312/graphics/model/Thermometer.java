package edu.westga.cs6312.graphics.model;

/**
 * This class models a thermometer which ...
 * 
 * @author Kent Kraus
 * @version 2018-03-28
 */
public class Thermometer {
	private int minimumTemperature;
	private int maximumTemperature;
	private int currentTemperature;
	
	/**
	 * 3-parameter constructor to create the Thermometer object
	 * 
	 * @param minTemp	a minimum temperature
	 * @param maxTemp	a maximum temperature
	 * @param currentTemp 	a current temperature
	 */
	public Thermometer(int minTemp, int maxTemp, int currentTemp) {
	    this.minimumTemperature = minTemp;
	    this.maximumTemperature = maxTemp;
	    this.currentTemperature = currentTemp;
	}
	
	/**
	 * Accessor for the minimum temperature
	 * 
	 * @return the minimum temperature
	 */
	public Integer getMinimumTemperature() {
	    return this.minimumTemperature;
	}
	
	/**
	 * Accessor for the minimum temperature
	 * 
	 * @return the maximum temperature
	 */
	public Integer getMaximumTemperature() {
	    return this.maximumTemperature;
	}
	
	/**
	 * Accessor for the current temperature
	 * 
	 * @return the current temperature
	 */
	public Integer getCurrentTemperature() {
	    return this.currentTemperature;
	}
	
	/**
	 * Builds and returns an output of the thermometer temperatures
	 * 
	 * @return	a String representation of the thermometer temperatures
	 */
	public String toString() {
	    String result = "";
	    result = this.getMinimumTemperature() + " " + this.getMaximumTemperature()
	    	+ " " + this.getCurrentTemperature();
	    return result;
	}

}