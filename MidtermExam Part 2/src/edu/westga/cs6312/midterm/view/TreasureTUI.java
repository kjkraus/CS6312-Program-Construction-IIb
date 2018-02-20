package edu.westga.cs6312.midterm.view;

import java.util.Scanner;
import edu.westga.cs6312.midterm.model.GameBoard;

/**
 * This class displays the welcome message, menu, and accepts input options
 * 
 * @author Kent Kraus
 * @version 2018-02-19
 */
public class TreasureTUI {
    private Scanner input;
    private GameBoard currentGameboard;
    
    /**
     * 1-parameter constructor to create the TreasureTUI object
     * 
     * @param	currentGameboard	a gameboard that will keep track of the current game
     */
    public TreasureTUI(GameBoard currentGameboard) {
        this.currentGameboard = currentGameboard;
        this.input = new Scanner(System.in);
    }
    
    /**
     * Helper method to begin the routine of the textual user interface
     */
    public void run() {
        System.out.println("\tWelcome to the Treasure Hunter application!");
        int choice = 0;
        
        do {
            System.out.println();
            System.out.println("\t\t1 - Describe the room");
            System.out.println("\t\t2 - Describe the player");
            System.out.println("\t\t3 - Describe the game board");
            System.out.println("\t\t4 - Move");
            System.out.println("\t\t9 - Quit");
            System.out.println();
            choice = this.getUserInt("Please enter your choice");
            if (choice == 1) {
        		this.describeRoom();
            } else if (choice == 2) {
       		    this.describePlayer();
            } else if (choice == 3) {
        	    this.describeGameboard();
            } else if (choice == 4) {
        	    this.move();
            } else if (choice == 9) {
                choice = 9;
            } else {
                System.out.println("\tThat is not a valid option. Please try again.");
            }
            
        } while (choice != 9);
    	System.out.println();
    	System.out.println("\tThank you for looking for treasure with us.");
    	System.out.println("\tGoodbye!");
    }
    
    /**
     * Accepts user input and returns an integer
     * 
     * @param 	message		the message prompt for the user
     * @return	userSelection	the integer value given by the user		
     */
    private int getUserInt(String message) {
        System.out.print("\t" + message + ": ");
        String enteredChoice = this.input.nextLine();
        int userSelection = Integer.parseInt(enteredChoice);
        return userSelection;
    }
    
    /**
     * Accepts user input for a choice or directions, left or right; then based upon that
     *   input, moves the player one room in that direction
     */
    private void move() {
	
    }
    
    /**
     * Helper method to describe the room
     */
    public void describeRoom() {
        System.out.println("\n\t" + this.currentGameboard.getCurrentRoom().getLocation().toString() 
    	    + this.currentGameboard.getCurrentRoom().getTreasure().toString());
    }
    
    /**
     * Helper method to describe the player
     */
    public void describePlayer() {
        System.out.println("\t" + this.currentGameboard.getPlayer().toString());
    }
    
    /**
     * Helper method to describe the game board
     */
    public void describeGameboard() {
        System.out.println(this.currentGameboard.toString());
        System.out.println("");
        System.out.println("\t" + this.currentGameboard.getPlayer().toString());
        System.out.println("\t" + this.currentGameboard.getCurrentRoom().toString());
    }
}
