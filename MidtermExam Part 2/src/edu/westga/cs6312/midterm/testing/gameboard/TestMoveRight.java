package edu.westga.cs6312.midterm.testing.gameboard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.midterm.model.GameBoard;

class TestMoveRight {

    /**
     * Test to see that a new Player is moved to room at position 1
     */
    @Test
    void testPlayerIsMovedToPosition1() {
        GameBoard theGameBoard = new GameBoard();
        theGameBoard.moveRight();
        assertEquals("Room at position 1 ", theGameBoard.getCurrentRoom().getLocation().toString());
    }
    
    /**
     * Test to see that a new Player is moved to room at position 9
     */
    @Test
    void testPlayerIsMovedToPosition9() {
        GameBoard theGameBoard = new GameBoard();
        for (int counter = 0; counter < 9; counter++) {
            theGameBoard.moveRight();
        }
        assertEquals("Room at position 9 ", theGameBoard.getCurrentRoom().getLocation().toString());
    }
    
    /**
     * Test to see that a new Player is moved to room at position 5
     */
    @Test
    void testPlayerIsMovedToPosition5() {
        GameBoard theGameBoard = new GameBoard();
        for (int counter = 0; counter < 5; counter++) {
            theGameBoard.moveRight();
        }
        assertEquals("Room at position 5 ", theGameBoard.getCurrentRoom().getLocation().toString());
    }
    
    /**
     * Test to see that a new Player is moved to room at position 2
     */
    @Test
    void testPlayerIsMovedToPosition2() {
        GameBoard theGameBoard = new GameBoard();
        for (int counter = 0; counter < 12; counter++) {
            theGameBoard.moveRight();
        }
        assertEquals("Room at position 2 ", theGameBoard.getCurrentRoom().getLocation().toString());
    }

}
