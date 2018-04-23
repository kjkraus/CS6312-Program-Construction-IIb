package edu.westga.cs6312.files.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.files.model.Team;
import edu.westga.cs6312.files.model.TeamManager;

class TestTeamManagerAddTeam {

    /**
     * Test to see if addTeam returns a value of Bengals 10 0
     */
    @Test
    void testAddTeamReturnsAValueOfBengalsZeroZero() {
        Team theTeam = new Team("Bengals", 10, 0);
        TeamManager theTeamManager = new TeamManager();
        theTeamManager.addTeam(theTeam);
        assertEquals("[The team, Bengals, has 10 wins and 0 losses.]", theTeamManager.getTeams().toString()); 
    }
    
    /**
     * Test to see if addTeam returns a value of Tigers 0 1
     */
    @Test
    void testAddTeamReturnsAValueOfTigersZeroOne() {
        Team theTeam = new Team("Tigers", 0, 1);
        TeamManager theTeamManager = new TeamManager();
        theTeamManager.addTeam(theTeam);
        assertEquals("[The team, Tigers, has 0 wins and 1 losses.]", theTeamManager.getTeams().toString()); 
    }
    
    /**
     * Test to see if addTeam returns a value of Dolphins 1001 99
     */
    @Test
    void testAddTeamReturnsAValueOfDolphins1001And99() {
        Team theTeam = new Team("Dolphins", 1001, 99);
        TeamManager theTeamManager = new TeamManager();
        theTeamManager.addTeam(theTeam);
        assertEquals("[The team, Dolphins, has 1001 wins and 99 losses.]", theTeamManager.getTeams().toString()); 
    }
    
    /**
     * Test to see if addTeam returns a value of Braves 55 33
     */
    @Test
    void testAddTeamReturnsAValueOfBraves55And33() {
        Team theTeam = new Team("Braves", 55, 33);
        TeamManager theTeamManager = new TeamManager();
        theTeamManager.addTeam(theTeam);
        assertEquals("[The team, Braves, has 55 wins and 33 losses.]", theTeamManager.getTeams().toString()); 
    }

}
