package edu.westga.cs6312.recursion.view;

import java.io.File;
import java.io.FileNotFoundException;
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
    private TemperatureManager collectionOfTemperatures;
    
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
        this.collectionOfTemperatures = currentTemperatures;
    }
    
    /**
     * Helper method to begin the routine of the textual user interface
     */
    public void run() { 	
    	this.displayMenu();
    }
    
    /**
     * Helper method to display the menu options and accept input from the user
     */
    public void displayMenu() {
    	System.out.println("\tWelcome to the Temperature List Reverser");
    	int choice = 0;
    	
    	do {
            System.out.println();
            System.out.println("\t\t1 - Add Temperatures from a file");
            System.out.println("\t\t2 - Display the original Temperatures on the console");
            System.out.println("\t\t3 - Display the loop-reversed Temperatures on the console");
            System.out.println("\t\t4 - Display the recursive-reversed Temperatures on the console");
            System.out.println("\t\t5 - Quit");
            System.out.println();
        
            choice = this.getUserInt("Please enter your choice");
            
            if (choice == 1) {
        	    this.addTemperaturesFromFile();
        	} else if (choice == 2) {
        	    this.displayOriginalTemperatures(); 
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
                String enteredChoice = this.input.nextLine();
                userSelection = Integer.parseInt(enteredChoice);
                isValid = true;
            } catch (NumberFormatException nfe) {
            	System.out.println("\tThat is not a valid integer. Please try again.");
            	System.out.println();
            } 
            
        } while (!isValid);
        return userSelection;
    }
    
    /**
     * Helper method to add temperatures from a file
     */
    public void addTemperaturesFromFile() {
    	
        System.out.print("\tPlease enter the filename: ");
        String fileName = this.input.nextLine();
        File myFile = new File(fileName);
        Scanner inFile = null;
        boolean isValid = false;
        
        try {
            inFile = new Scanner(myFile);
            while (inFile.hasNext()) {
                String input = inFile.nextLine();
                try {
                    int nextTemperature = Integer.parseInt(input);
                    System.out.println("\tRead temperature: " + input);	    
                    do {
                        this.collectionOfTemperatures.addTemperature(nextTemperature);
                        isValid = true;
                    }  while (!isValid);
                } catch (IllegalArgumentException iae) { }
            }
            inFile.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("\n\tFile not found. Returning to main menu.");
        } catch (NumberFormatException nfe) {
            System.out.println("\n\tRead past the end of the file.");
            inFile.close();
        }

    }
        
    /**
     * Helper method to display temperatures in original order 
     */
    public void displayOriginalTemperatures() {
        System.out.println();
      	System.out.println("\tThe original temperatures are: ");
       	System.out.println("\t" + this.collectionOfTemperatures.toString());        
    }
    
    /**
     * Helper method to display temperatures in reversed order created from a loop
     */
    public void displayLoopReversedTemperatures() {
        System.out.println();
      	System.out.println("\tThe loop-reversed temperatures are: ");
       	System.out.println("\t" + this.collectionOfTemperatures.reverseLoop());        
    }
    
    /**
     * Helper method to display temperatures in reversed order created from recursion
     */
    public void displayRecursiveReversedTemperatures() {
        System.out.println();
     	System.out.println("\tThe recursive-reversed temperatures are: ");
      	System.out.println("\t" + this.collectionOfTemperatures.reverseRecursion());      
    }
}

