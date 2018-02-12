package edu.westga.cs6312.interfaces.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import edu.westga.cs6312.interfaces.model.Team;

class TeamWhenIncrementLosses {

    /**
     * Test to confirm incrementing a loss will produce a value of 1
     */
    @Test
    void testIncrementLossShouldGiveValueOf1() {
        Team theTeam = new Team("Penguins");
        theTeam.incrementLosses();
        assertEquals("The team, Penguins, has 0 wins and 1 losses.", theTeam.toString());
    }
    
    /**
     * Test to confirm incrementing a loss 11 times will produce a value of 11
     */
    @Test
    void testIncrementLoss11TimesShouldGiveValueOf11() {
        Team theTeam = new Team("Hawks");
        for (int counter = 0; counter <= 10; counter++) {
            theTeam.incrementLosses();
        }
        assertEquals("The team, Hawks, has 0 wins and 11 losses.", theTeam.toString());
    }
    
    /**
     * Test to confirm incrementing a loss 99 times will produce a value of 99
     */
    @Test
    void testIncrementLoss99TimesShouldGiveValueOf99() {
        Team theTeam = new Team("Falcons", 100, 0);
        for (int counter = 0; counter <= 98; counter++) {
            theTeam.incrementLosses();
        }
        assertEquals("The team, Falcons, has 100 wins and 99 losses.", theTeam.toString());
    }
    
    /**
     * Test to confirm incrementing a loss 21 times will produce a value of 30
     */
    @Test
    void testIncrementLoss21TimesShouldGiveValueOf30() {
        Team theTeam = new Team("Seahawks", 30, 9);
        for (int counter = 0; counter <= 20; counter++) {
            theTeam.incrementLosses();
        }
        assertEquals("The team, Seahawks, has 30 wins and 30 losses.", theTeam.toString());
    }

}
