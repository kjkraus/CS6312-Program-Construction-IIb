package edu.westga.cs6312.interfaces.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import edu.westga.cs6312.interfaces.model.Team;

class TeamWhenIncrementWins {
    
    /**
     * Test to confirm incrementing a win will produce a value of 1
     */
    @Test
    void testIncrementWinShouldGiveValueOf1() {
        Team theTeam = new Team("Blue Jays");
        theTeam.incrementWins();
        assertEquals("The team, Blue Jays, has 1 wins and 0 losses.", theTeam.toString());
    }
    
    /**
     * Test to confirm incrementing a win 5 times will produce a value of 5
     */
    @Test
    void testIncrementWin5TimesShouldGiveValueOf5() {
        Team theTeam = new Team("Hawks");
        for (int counter = 0; counter <= 4; counter++) {
            theTeam.incrementWins();
        }
        assertEquals("The team, Hawks, has 5 wins and 0 losses.", theTeam.toString());
    }
    
    /**
     * Test to confirm incrementing a win 100 times will produce a value of 105
     */
    @Test
    void testIncrementWin100TimesShouldGiveValueOf105() {
        Team theTeam = new Team("Cardinals", 5, 99);
        for (int counter = 0; counter <= 99; counter++) {
            theTeam.incrementWins();
        }
        assertEquals("The team, Cardinals, has 105 wins and 99 losses.", theTeam.toString());
    }
    
    /**
     * Test to confirm incrementing a win 9 times will produce a value of 34
     */
    @Test
    void testIncrementWin9TimesShouldGiveValueOf34() {
        Team theTeam = new Team("Orioles", 25, 30);
        for (int counter = 0; counter <= 8; counter++) {
            theTeam.incrementWins();
        }
        assertEquals("The team, Orioles, has 34 wins and 30 losses.", theTeam.toString());
    }

}
