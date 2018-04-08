package edu.westga.cs6312.events.model;

/**
 * This class models a regulator which contains a value
 *  that can incremented and decremented.
 * 
 * @author Kent Kraus
 * @version 2018-04-08
 */
public class Regulator {
    private int currentRegulatorSetting;
    
    /**
     * 0-parameter constructor to create the Regulator object
     */
    public Regulator() {
        this.currentRegulatorSetting = 0;
    }
    
    /**
     * Accessor for the current regulator setting
     * 
     * @return	 the current setting
     */
    public int getCurrentRegulatorSetting() {
        return this.currentRegulatorSetting;
    }
    
    /**
     * Mutator for the current regulator setting
     * 
     * @param regulatorSetting	a setting for the regulator
     */
    public void setCurrentRegulatorSetting(int regulatorSetting) {
        this.currentRegulatorSetting = regulatorSetting;
    }
    
    /**
     * Increments the regulator setting by 1 
     */
    public void increment() {
        this.currentRegulatorSetting++;
    }
    
    /**
     * Decrements the regulator setting by 1 
     */
    public void decrement() {
        this.currentRegulatorSetting--;
    }
 
}
