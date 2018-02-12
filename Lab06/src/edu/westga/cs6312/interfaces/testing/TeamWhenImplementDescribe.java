package edu.westga.cs6312.interfaces.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import edu.westga.cs6312.interfaces.model.Team;

class TeamWhenImplementDescribe {

    /**
     * Test to confirm format of the description of a new team
     *   with no games won or lost
     */
    @Test
    void testDescriptionOfTeamWithNoWinsNoLosses() {
        Team theTeam = new Team("Oilers");
        assertEquals("Oilers     0.000  0 |  0", theTeam.describe());
    }
    
    /**
     * Test to confirm format of the description of a new team
     *   with 10 games won and 10 games lost
     */
    @Test
    void testDescriptionOfTeamWith10Wins10Losses() {
        Team theTeam = new Team("Packers", 10, 10);
        assertEquals("Packers    0.500 10 | 10", theTeam.describe());
    }
    
    /**
     * Test to confirm format of the description of a new team
     *   with 6 games won and 10 games lost
     */
    @Test
    void testDescriptionOfTeamWith6Wins10Losses() {
        Team theTeam = new Team("Bears", 6, 10);
        assertEquals("Bears      0.375  6 | 10", theTeam.describe());
    }
    
    /**
     * Test to confirm format of the description of a new team
     *   with 10 games won and 5 games lost
     */
    @Test
    void testDescriptionOfTeamWith10Wins5Losses() {
        Team theTeam = new Team("Colts", 10, 5);
        assertEquals("Colts      0.667 10 |  5", theTeam.describe());
    }
    
    /**
     * Test to confirm format of the description of a new team
     *   with 2 games won and 0 games lost
     */
    @Test
    void testDescriptionOfTeamWith2Wins0Losses() {
        Team theTeam = new Team("Bucs", 2, 0);
        assertEquals("Bucs       1.000  2 |  0", theTeam.describe());
    }
}
