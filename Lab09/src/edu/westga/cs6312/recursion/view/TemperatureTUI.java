package edu.westga.cs6312.recursion.view;

import java.util.Scanner;
import edu.westga.cs6312.recursion.model.TemperatureManager;


/**
 * This class displays the welcome message, input options, and list of temperatures
 * 
 * @author Kent Kraus
 * @version 2018-03-11
 */

public class TemperatureTUI {
    private Scanner input;
    private TemperatureManager collectionofTemperatures;
    
    /**
     * 1-parameter constructor to create a TemperatureTUI object
     * 
     * @param currentTemperatures	a collection of temperatures
     */
    public TemperatureTUI(TemperatureManager currentTemperatures) {
        if (currentTemperatures == null) {
            throw new IllegalArgumentException("The TemperatureManager object cannot be null. ");
        }
        this.input = new Scanner(System.in);
        this.collectionofTemperatures = currentTemperatures;
    }
    
    /**
     * Helper method to begin the routine of the textual user interface
     */
    public void run() {
    	System.out.println("\tWelcome to the Temperature List Reverser");
    	this.displayMenu();
    }
    
    /**
     * Helper method to display the menu options and accept input from the user
     */
    public void displayMenu() {
    	int choice = 0;
    	
    	do {
            System.out.println();
            System.out.println("\t\t1 - Add Temperatures from a file");
            System.out.println("\t\t2 - Display the original Temperatures on the console");
            System.out.println("\t\t3 - Display the loop-reversed Temperatures on the console");
            System.out.println("\t\t3 - Display the recursive-reversed Temperatures on the console");
            System.out.println("\t\t5 - Quit");
            System.out.println();
        
            System.out.print("\tEnter your choice: ");
            String enteredChoice = this.input.nextLine();
            choice = Integer.parseInt(enteredChoice);
            
            if (choice == 1) {
        	    this.addTemperatures();
        	} else if (choice == 2) {
        	    this.getOriginalTemperatures(); 
        	} else if (choice == 3) {
        	    this.displayLoopReversedTemperatures();
        	} else if (choice == 4) {
        	    this.displayRecursiveReversedTemperatures(); 
        	} else if (choice < 1 || choice > 5) {
        	    System.out.println();
        	    System.out.println("\tThat's not a valid choice. Please try again.");
        	}
        	
    	} while (choice != 5);
    	System.out.println();
    	System.out.println("\tThank you for using the Temperature Reverser application.");
    	System.out.println("\tGoodbye!");
    } 
}

