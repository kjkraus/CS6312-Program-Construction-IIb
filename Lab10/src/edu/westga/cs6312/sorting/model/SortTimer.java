package edu.westga.cs6312.sorting.model;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * This class models a sort timer which can start and stop to track how long it
 *  takes code to execute.
 * 
 * @author Kent Kraus
 * @version 2018-03-19
 */
public class SortTimer {
    private Instant startTime;
    private Instant endTime;
    private Boolean timerOn;
    
    /**
     * 0-parameter constructor to create the SortTimer object
     */
    public SortTimer() {
        this.timerOn = false;
    }
    
    /**
     * Helper method that retrieves and stores the current system time in the startTime variable
     */
    public void startTimer() {
    	this.startTime = Instant.now();
    	this.timerOn = true;
    }
    
    /**
     * Helper method that retrieves and stores the current system time in the endTime variable
     */
    public void stopTimer() {
    	this.endTime = Instant.now();
    	this.timerOn = false;
    }
    
    /**
     * Helper method that retrieves the amount of time elapsed between startTime and endTime
     * 
     * @return	the number of milliseconds that have elapsed 
     */
    public long getElapsedTime() {
        if ((this.startTime == null) || (this.endTime == null)) {
    		return 0;
        } else {
            long difference = ChronoUnit.MILLIS.between(this.startTime, this.endTime);
            return difference;
        }
    }
    
    /**
     * Returns a complete sentence describing the sort timer.
     * 
     * @return	a description of the timer state
     */
    public String toString() {
        return "Timer on: " + this.timerOn + " Timer difference: " + this.getElapsedTime();
    }
    
    /**
     * Accessor for the start time
     * 
     * @return the start time
     */
    public Instant getStartTime() {
        return this.startTime;
    }
    
    /**
     * Accessor for the end time
     * 
     * @return the end time
     */
    public Instant getEndTime() {
        return this.endTime;
    }
}
