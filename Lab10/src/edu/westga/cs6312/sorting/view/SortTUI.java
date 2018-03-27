package edu.westga.cs6312.sorting.view;

import java.util.Scanner;
import edu.westga.cs6312.sorting.model.ArrayUtility;
import edu.westga.cs6312.sorting.model.SortTimer;

/**
 * This class displays the welcome message, menu, and accepts input options
 * 
 * @author Kent Kraus
 * @version 2018-03-26
 */
public class SortTUI {
    private ArrayUtility sortManagerForArrays;
    private SortTimer arraySortTracker;
    private Scanner input;
    
    /**
     * 0-parameter constructor to create the SortTUI object
     */
    public SortTUI() {
        this.input = new Scanner(System.in);
        this.sortManagerForArrays = new ArrayUtility();
        this.arraySortTracker = new SortTimer();
    }
    
    /**
     * Helper method to direct the flow of the application
     */
    public void run() {
        this.displayBanner();
        int arraySize = this.getArraySizeFromUser();
        System.out.println("The size of the array is: " + arraySize);
    }
    
    /**
     * Helper method to display the menu choices
     */
    public void displayBanner() {
        System.out.println("\tWelcome to the Sorting Application");
        System.out.println();
    }
    
    /**
     * Helper method to manage the user input
     * 
     * @return the size of the array determined by the user
     */
    public int getArraySizeFromUser() {
        int choice = 0;
        do {
            choice = this.getUserInt("Please enter an array size: ");
            if (choice < 1) {
        		System.out.println("\tArray size must be greater than 0. Please try again.");
            }
        } while (choice < 1);
        return choice;
    }
    
    /**
     * Accepts user input and returns an integer
     * 
     * @param 	message		the message prompt for the user
     * @return	userSelection	the integer value given by the user		
     */
    private int getUserInt(String message) {
        boolean isValid = false;
        int userSelection = 0;
        do {
            try {
                System.out.print("\t" + message + ": ");
                String enteredSize = this.input.nextLine();
                userSelection = Integer.parseInt(enteredSize);
                isValid = true;
            } catch (NumberFormatException nfe) {
            	System.out.println("\tThat is not a valid integer. Please try again.");
            	System.out.println();
            } 
            
        } while (!isValid);
        return userSelection;
    }
}
