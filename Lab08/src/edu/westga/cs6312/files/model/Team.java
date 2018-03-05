package edu.westga.cs6312.files.model;

/**
 * This class models a sports Team by keeping track of its win/loss records
 * 
 * @author Kent Kraus
 * @version 2018-03-04
 */
public class Team {
    private String teamName;
    private int numberOfWins;
    private int numberOfLosses;
	    	    
    /**
     * A 3-parameter constructor to create a Team object
     * 
     * @param name	The name of the team
     * @param wins	The number of team wins
     * @param losses	The number of team losses
     */
    public Team(String name, int wins, int losses) {
        this.teamName = name;
        this.numberOfWins = wins;
        this.numberOfLosses = losses;		
    }
	    	    
    /**
     * Returns a complete sentence describing the team
     * 
     * @return	a description of the team
     */
    public String toString() {
        return "The team, " + this.teamName + ", has " + this.numberOfWins 
        	+ " wins and " + this.numberOfLosses + " losses.";
    }
}