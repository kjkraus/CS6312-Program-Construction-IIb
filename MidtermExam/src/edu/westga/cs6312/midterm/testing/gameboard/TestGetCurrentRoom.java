package edu.westga.cs6312.midterm.testing.gameboard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.midterm.model.GameBoard;

class TestGetCurrentRoom {

    /**
     * A test to see if a new game player's current room is returned as 0
     */
    @Test
    void testPlayerCurrentRoomReturns0() {
        GameBoard theGameBoard = new GameBoard();
        assertEquals("and is located in Room at position 0", theGameBoard.getCurrentRoom().toString());
    }

}
