package edu.westga.cs6312.files.model;

/**
 * This class models a sports Team by keeping track of its win/loss records
 * 
 * @author Kent Kraus
 * @version 2018-03-04
 */
public class Team implements Comparable<Team> {
    private String teamName;
    private int numberOfWins;
    private int numberOfLosses;
	    	    
    /**
     * A 3-parameter constructor to create a Team object
     * 
     * @param name	The name of the team
     * @param wins	The number of team wins
     * @param losses	The number of team losses
     * @precondition	teamName != null
     * @precondition	wins or losses cannot be less than 0
     */
    public Team(String name, int wins, int losses) {
        if (name == null) {
            throw new IllegalArgumentException("Team name cannot be null. ");
        }
        if (wins < 0 || losses < 0) {
            
            throw new IllegalArgumentException("Wins or losses cannot be less than 0. ");
        }
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
    
    /**
     * Returns the winning percentage of the team
     * 
     * @return	The number of wins divided by the total number of game played in double format
     */
    public Double getWinningPercentage() {
        double totalGamesPlayed = (double) (this.numberOfWins + this.numberOfLosses);
        if (totalGamesPlayed == 0) {
            return 0.0;
        }
        return (double) (this.numberOfWins / totalGamesPlayed);
    }
    
    /*
     * Implement the compareTo method defined in Comparable
     * (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Team otherTeam) {
       	if (this.getWinningPercentage() > otherTeam.getWinningPercentage()) {
       	    return -1;
       	} else if ((this.getWinningPercentage() < otherTeam.getWinningPercentage())) {
       	    return 1;
       	} else if ((this.getWinningPercentage().equals(otherTeam.getWinningPercentage())) && (this.numberOfWins > otherTeam.numberOfWins)) {
       	    return -1;
       	} else if ((this.getWinningPercentage().equals(otherTeam.getWinningPercentage())) && (this.numberOfWins < otherTeam.numberOfWins)) {
       	    return 1;
       	} else {
       	    return 0;
       	}
    }
}
