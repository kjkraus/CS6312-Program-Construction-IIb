package edu.westga.cs6312.interfaces.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import edu.westga.cs6312.interfaces.model.Team;

class TeamWhenCompareTo {

    /**
     * Test to confirm higher win percentage team is greater than the other team
     */
    @Test
    void testHigherWinPercentageTeamShouldGiveValueOf1() {
        Team theTeam = new Team("Penguins", 10, 1);
        Team otherTeam = new Team("Lakers", 9, 1);
        assertEquals(1, (theTeam.getWinningPercentage()).compareTo(otherTeam.getWinningPercentage()));
    }

}
