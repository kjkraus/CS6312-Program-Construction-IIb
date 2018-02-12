package edu.westga.cs6312.interfaces.model;

/**
 * This class models a sports Team by keeping track of its win/loss records
 * 
 * @author Kent Kraus
 * @version 2018-02-11
 */
public class Team implements Describable, Comparable<Team> {

    private String teamName;
    private int numberOfWins;
    private int numberOfLosses;
    
    /**
     * A 1-parameter constructor to create a Team object
     * 
     * @param name	The name of the team
     * 
     * Precondition	name != null
     * Postcondition	A team whose team name is name with 0 wins and 0 losses
     */
    public Team(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Invalid team name");
        }
        this.teamName = name;
        this.numberOfWins = 0;
        this.numberOfLosses = 0;
    }
    
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
     * Increment the team wins by one win
     */
    public void incrementWins() {
        this.numberOfWins++;
    }
    
    /**
     * Increment the team losses by one loss
     */
    public void incrementLosses() {
        this.numberOfLosses++;
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
     * Describes the team with their statistics
     * 
     * @return	teamResult	A statistical description of the team
     */
    @Override
    public String describe() {
        String teamResult = "";
        teamResult += String.format("%-10s", this.teamName) + " ";
        teamResult += String.format("%5.3f", this.getWinningPercentage()) + " ";
        teamResult += String.format("%2d", this.numberOfWins) + " | " + String.format("%2d", this.numberOfLosses);
        return teamResult;
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
       	} else if (this.getWinningPercentage() == otherTeam.getWinningPercentage() && this.numberOfWins > otherTeam.numberOfWins) {
       	    return -1;
       	} else if (this.getWinningPercentage() == otherTeam.getWinningPercentage() && this.numberOfWins < otherTeam.numberOfWins) {
       	    return 1;
       	} else {
       	    return 0;
       	}
    }
    
    
    
    
    
}
