package edu.westga.cs6312.stock.view;

import java.util.Scanner;
import edu.westga.cs6312.stock.model.StockManager;
import edu.westga.cs6312.stock.model.StockRecord;

/**
 * This class displays the welcome message, menu options, and collect input options.
 * 
 * @author Kent Kraus
 * @version 2018-04-23
 */
public class StockTUI {
    private Scanner input;
    private StockManager collectionOfRecords;
    
    /**
     * 1-parameter constructor to create a StockTUI object
     * 
     * @param currentRecords	a collection of stock records
     */
    public StockTUI(StockManager currentRecords) {
        if (currentRecords == null) {
            throw new IllegalArgumentException("The StockManager object cannot be null. ");
        }
        this.input = new Scanner(System.in);
        this.collectionOfRecords = currentRecords;
    }
    
    /**
     * Helper method to direct the flow of the application
     */
    public void run() {        
        int choice = 0;
        do {
            
            this.displayMenu();
        
            choice = this.getUserInt("Please enter your choice");
            if (choice == 1) {
        	    this.displaySummaryData();
        	} else if (choice == 2) {
        	    this.displayStatisticalData(); 
        	} else if (choice == 3) {
        	    this.displayAllRecords(); 
        	} else if (choice < 1 || choice > 4) {
        	    System.out.println();
        	    System.out.println("\tThat's not a valid menu option. Please try again.");
        	}
        } while (choice != 4);
        
        System.out.println();
    	System.out.println("\tThank you for using the Stock Manager Application.");
    	System.out.println("\tGoodbye!");
    }
    
    /**
     * Helper method to display the menu choices and collect user input
     */
    public void displayMenu() {
        System.out.println();
        System.out.println("\t\t1 - View summary data");
        System.out.println("\t\t2 - View statistical data");
        System.out.println("\t\t3 - View all records");
        System.out.println("\t\t4 - Quit");
        System.out.println();
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
     * Helper method to display summary data for stock records
     */
    public void displaySummaryData() {
        System.out.println();
        System.out.println("\t" + this.collectionOfRecords.getFileName());	
        if (this.collectionOfRecords.getRecords().isEmpty()) {
            System.out.println("\tThere are no records in the list.");
        } else {
            int middleIndex = (int) Math.ceil(this.collectionOfRecords.getRecords().size() / 2);
            int lastIndex = this.collectionOfRecords.getRecords().size() - 1;

            System.out.println("\tFirst Record:\t" + this.collectionOfRecords.getRecords().get(0));
            System.out.println("\tMiddle Record:\t" + this.collectionOfRecords.getRecords().get(middleIndex));
            System.out.println("\tLast Record:\t"  + this.collectionOfRecords.getRecords().get(lastIndex));
        }		
    }
    
    /**
     * Helper method to display statistical data for stock records
     */
    public void displayStatisticalData() {
        System.out.println();
        System.out.println("\t" + this.collectionOfRecords.getFileName());	
        if (this.collectionOfRecords.getRecords().isEmpty()) {
            System.out.println("\tThere are no records in the list.");
        } else {
            System.out.println("\tHighest Closing Price:\t" + (String.format("%.2f", this.collectionOfRecords.getHighestClosingPrice())));
            System.out.println("\tLowest Closing Price:\t" + (String.format("%.2f", this.collectionOfRecords.getLowestClosingPrice())));
            System.out.println("\tAverage Closing Price:\t"  + (String.format("%.2f", this.collectionOfRecords.getAverageClosingPrice())));
        }		
    }
    
    /**
     * Helper method to display all stock records
     */
    public void displayAllRecords() {
        System.out.println();
        System.out.println("\t" + this.collectionOfRecords.getFileName());	
        if (this.collectionOfRecords.getRecords().isEmpty()) {
            System.out.println("\tThere are no records in the list.");
        } else {
            for (StockRecord stock : this.collectionOfRecords.getRecords()) {
        		System.out.println("\t" + stock.toString());	    
        	}
        }		
    }
}
