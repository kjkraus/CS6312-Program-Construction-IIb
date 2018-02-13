package edu.westga.cs6312.interfaces.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import edu.westga.cs6312.interfaces.model.Team;

class TeamWhenCompareTo {

    /**
     * Test to confirm other lower win percentage team is less than the first team
     */
    @Test
    void testHigherWinPercentageTeamShouldGiveValueOfMinus1() {
        Team theTeam = new Team("Penguins", 10, 1);
        Team otherTeam = new Team("Lakers", 9, 1);
        assertEquals(-1, theTeam.compareTo(otherTeam));
    }
    
    /**
     * Test to confirm other team win percentage team is greater than the first team
     */
    @Test
    void testLowerWinPercentageTeamShouldGiveValueOf1() {
        Team theTeam = new Team("Padres", 2, 10);
        Team otherTeam = new Team("A's", 4, 8);
        assertEquals(1, (theTeam.compareTo(otherTeam)));
    }
    
    /**
     * Test to confirm same win percentage teams with same number of wins
     */
    @Test
    void testSameWinPercentageTeamWithSameNumberOfWinsShouldGiveValueOf0() {
        Team theTeam = new Team("Braves", 4, 10);
        Team otherTeam = new Team("Giants", 4, 10);
        assertEquals(0, (theTeam.compareTo(otherTeam)));
    }
    
    /**
     * Test to confirm same win percentage teams but other team has less wins than the other team
     */
    @Test
    void testSameWinPercentageTeamWithMoreWinsShouldGiveValueOfMinus1() {
        Team theTeam = new Team("Cowboys", 4, 16);
        Team otherTeam = new Team("Colts", 2, 8);
        assertEquals(-1, (theTeam.compareTo(otherTeam)));
    }
    
    /**
     * Test to confirm same win percentage teams but other team has more wins than the first team
     */
    @Test
    void testSameWinPercentageOtherTeamWithMoreWinsShouldGiveValueOf1() {
        Team theTeam = new Team("Blue Jays", 3, 9);
        Team otherTeam = new Team("Cardinals", 5, 15);
        assertEquals(1, (theTeam.compareTo(otherTeam)));
    }
}
