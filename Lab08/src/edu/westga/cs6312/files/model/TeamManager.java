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
	
    }
    
    /**
     * Will return a list of teams
     * 
     * @return  a list of teams
     */
    public ArrayList<Team> getTeams() {
    
        return this.listOfTeams;
    }
    
}
