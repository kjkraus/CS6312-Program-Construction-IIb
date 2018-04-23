package edu.westga.cs6312.files.model;

import java.util.ArrayList;

/**
 * This class models a list of sports teams
 * 
 * @author Kent Kraus
 * @version 2018-03-04
 */
public class TeamManager {
    private ArrayList<Team> listOfTeams;
    
    /**
     * 0-parameter constructor to create the TeamManager object
     */
    public TeamManager() {
        this.listOfTeams = new ArrayList<Team>();
    }
    
    /**
     * Will accept a Team object to be added to the collection
     * 
     * @param  currentTeam	a team to be added to the team manager
     */
    public void addTeam(Team currentTeam) {
        if (currentTeam == null) {
            throw new IllegalArgumentException("Team cannot be null. ");
        }
    	this.listOfTeams.add(currentTeam);
    }
    
    /**
     * Accessor method will return a list of teams
     * 
     * @return  a list of teams
     */
    public ArrayList<Team> getTeams() {
    
        return this.listOfTeams;
    }
    
    /**
     * Builds and returns an output of the the list of teams, one per line
     * 
     * @return	a string representation of the list of test scores
     */
    public String toString() {
        if (this.listOfTeams.isEmpty()) {
            String result = "\n\tThere are no teams recorded.";
            return result;
        }
        String result = this.listOfTeams + "'s scores are:";
        for (int counter = 0; counter < this.listOfTeams.size(); counter++) {
            result += "\n\t\t" + this.listOfTeams.get(counter);
        }
        return result;
    }
    
}
