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
            System.out.println("\t\t9 - Quit");
            System.out.println();
            this.getUserInt("Please enter your choice");
            if (this.getUserInt("Please enter your choice") == 1) {
        		this.describeRoom();
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
     * Helper method to describe the room
     */
    public void describeRoom() {
	
    }
}
