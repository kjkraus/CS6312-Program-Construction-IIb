package edu.westga.cs6312.midterm.testing.gameboard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.midterm.model.GameBoard;

class TestGetPlayer {

    /**
     * Test to see that the Player is returned in a new game
     */
    @Test
    void testPlayerIsReturnedWithANewGameBoard() {
        GameBoard theGameBoard = new GameBoard();
        assertEquals("Player with 100 money units remaining", theGameBoard.getPlayer().toString());
    }
}
