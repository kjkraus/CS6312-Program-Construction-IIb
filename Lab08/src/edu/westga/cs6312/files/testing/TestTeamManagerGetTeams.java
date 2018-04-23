package edu.westga.cs6312.files.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.files.model.Team;
import edu.westga.cs6312.files.model.TeamManager;

class TestTeamManagerGetTeams {

    /**
     * Test to see if getTeams returns a value of one team, Bengals 5 5
     */
    @Test
    void testGetTeamsReturnsAValueOfOneTeam() {
        Team theTeam = new Team("Bengals", 5, 5);
        TeamManager theTeamManager = new TeamManager();
        theTeamManager.addTeam(theTeam);
        assertEquals("[The team, Bengals, has 5 wins and 5 losses.]", theTeamManager.getTeams().toString());
    }
    
    /**
     * Test to see if getTeams returns a value of two teams, Bengals 5 5 and Tigers 100 99
     */
    @Test
    void testGetTeamsReturnsAValueOfTwoTeams() {
        TeamManager theTeamManager = new TeamManager();
        Team theTeam = new Team("Bengals", 5, 5);
        theTeamManager.addTeam(theTeam);
        Team secondTeam = new Team("Tigers", 100, 99);
        theTeamManager.addTeam(secondTeam);
        assertEquals("[The team, Bengals, has 5 wins and 5 losses., The team, Tigers, has 100 wins and 99 losses.]", 
        	theTeamManager.getTeams().toString());
    }
    
    /**
     * Test to see if getTeams returns a value of three teams, Bengals 1 2, Tigers 11 10, and Cubs 8 9
     */
    @Test
    void testGetTeamsReturnsAValueOfThreeTeams() {
        TeamManager theTeamManager = new TeamManager();
        Team theTeam = new Team("Bengals", 1, 2);
        theTeamManager.addTeam(theTeam);
        Team secondTeam = new Team("Tigers", 11, 10);
        theTeamManager.addTeam(secondTeam);
        Team thirdTeam = new Team("Cubs", 8, 9);
        theTeamManager.addTeam(thirdTeam);
        assertEquals("[The team, Bengals, has 1 wins and 2 losses., The team, Tigers, has 11 wins and 10 losses., "
        	+ "The team, Cubs, has 8 wins and 9 losses.]", theTeamManager.getTeams().toString());
    }

}
