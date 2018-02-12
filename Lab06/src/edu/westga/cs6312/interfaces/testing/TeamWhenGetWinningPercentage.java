package edu.westga.cs6312.interfaces.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import edu.westga.cs6312.interfaces.model.Team;

class TeamWhenGetWinningPercentage {
    private static final double EPSILON = .0001;
    
    /**
     * Test to confirm win % will produce a value of .50
     */
    @Test
    void testWinPercentShouldGiveValueOfPoint50() {
        Team theTeam = new Team("NY Giants", 50, 50);
        assertEquals(0.50, theTeam.getWinningPercentage(), EPSILON);
    }
    
    /**
     * Test to confirm win % will produce a value of .3333
     */
    @Test
    void testWinPercentShouldGiveValueOfPoint333() {
        Team theTeam = new Team("Dodgers", 11, 22);
        assertEquals(0.3333, theTeam.getWinningPercentage(), EPSILON);
    }
    
    /**
     * Test to confirm win % will produce a value of 0
     */
    @Test
    void test0TotalGamesShouldGiveValueOf0() {
        Team theTeam = new Team("Buffalo Bills");
        assertEquals(0.0, theTeam.getWinningPercentage(), EPSILON);
    }
    
    /**
     * Test to confirm win % will produce a value of 0
     */
    @Test
    void testWinsOf0ShouldGiveValueOf0() {
        Team theTeam = new Team("Oilers", 0, 10);
        assertEquals(0.0, theTeam.getWinningPercentage(), EPSILON);
    }
    
    /**
     * Test to confirm win % will produce a value of 1.0
     */
    @Test
    void testWinsPercentShouldGiveValueOf1Point00() {
        Team theTeam = new Team("Lightning", 5, 0);
        assertEquals(1.00, theTeam.getWinningPercentage(), EPSILON);
    }
}
