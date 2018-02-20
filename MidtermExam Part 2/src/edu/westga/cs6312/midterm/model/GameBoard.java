package edu.westga.cs6312.midterm.model;

import java.util.Random;

/**
 * This class models a game board that will keep track of the state of the game
 * 
 * @author Kent Kraus
 * @version 2018-02-18
 */
public class GameBoard {
    private Room[] roomArray;
    private Random random;
    private Player currentPlayer;
    private int playerLocation;
    
    /**
     * 0-parameter constructor to initialize the Random and set up game board for play
     */
    public GameBoard() {
        this.random = new Random();
        this.setupBoard();
    }
    
    /**
     * Initializes the Player and Rooms, sets the player location to room 0
     */
    private void setupBoard() {
        this.currentPlayer = new Player();
        this.playerLocation = 0;
        this.roomArray = new Room[10];
        	
        for (int counter = 0; counter < this.roomArray.length; counter++) {
            this.roomArray[counter] = new Room(counter, this.random);
		}
    }
    
    /**
     * Accessor method that returns the Player
     * 
     * @return	the current player
     */
    public Player getPlayer() {
        return this.currentPlayer;
    }
    
    /**
     * Accessor method that returns the room where the Player is currently located
     * 
     * @return	the current player's room location
     */
    public Room getCurrentRoom() {
        return this.roomArray[this.playerLocation];
    }
    
    /**
     * Returns a description of the game board
     * 
     * @return	a String description of the game board
     */
    public String toString() {
        String overiewOfGameBoard = "";
        for (int current = 0; current <= 9; current++) {
            overiewOfGameBoard += "\n\t" + this.roomArray[current].getLocation().toString() 
        	    + this.roomArray[current].getTreasure().toString();
        }
        return overiewOfGameBoard;
    }
    
    /**
     * Moves the current player one room to the right. If the player is at the right-most
     *   room, this will move the player to the farthest left room (simulates a world that 'wraps')
     */
    public void moveRight() {
	
    }
    
    /**
     * Moves the current player one room to the left. If the player is at the left-most
     *   room, this will move the player to the farthest right room (simulates a world that 'wraps')
     */
    public void moveLeft() {
	
    }
    
}
    
    

    


	


