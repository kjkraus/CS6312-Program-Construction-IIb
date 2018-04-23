package edu.westga.cs6312.stock.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
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
        this.displayBanner();
        this.addRecordsFromFile();
        this.displayMenu();
    }
    
    /**
     * Helper method to add records from a file
     */
    public void addRecordsFromFile() {
    	
        System.out.print("\tPlease enter the filename: ");
        String fileName = this.input.nextLine();
        File myFile = new File(fileName);
        Scanner inFile = null;
        
        try {
            inFile = new Scanner(myFile);
            inFile.useDelimiter(", *");
            while (inFile.hasNext()) {
                String recordDate = (inFile.next());
        	//Manage comma delimited values to skip thru after closing price	    
                double closingPrice = (inFile.nextDouble());
                //double someValue = (inFile.nextInt());
                StockRecord nextRecord = new StockRecord(recordDate, closingPrice);
                this.collectionOfRecords.addRecord(nextRecord);
                inFile.close();
            }  
       	    
       	    for (StockRecord stock : this.collectionOfRecords.getRecords()) {
       			System.out.println("\t" + stock.toString());		    
       	    }
            inFile.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("\n\tFile not found. Returning to main menu.");
        } catch (NoSuchElementException nsee) {
            System.out.println("\n\tRead past the end of the file.");
            inFile.close();
        }
        
    }
    
    /**
     * Helper method to display the banner welcome message
     */
    public void displayBanner() {
        System.out.println("\tWelcome to the Stock Manager Application");
        System.out.println();
    }
    
    /**
     * Helper method to display the menu choices and collect user input
     */
    public void displayMenu() {
        int choice = 0;
    	
    	do {
            System.out.println();
            System.out.println("\t\t1 - View summary data");
            System.out.println("\t\t2 - View statistical data");
            System.out.println("\t\t3 - View all records");
            System.out.println("\t\t4 - Quit");
            System.out.println();
        
            choice = this.getUserInt("Please enter your choice");
            
            if (choice == 1) {
        	    this.addRecordsFromFile();
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
    	System.out.println("\tThank you for using the Stock Manager Manager application.");
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
     * Helper method to display all stock records
     */
    public void displayAllRecords() {
        System.out.println();
        	
        if (this.collectionOfRecords.getRecords().isEmpty()) {
            System.out.println("\tThere are no records in the list.");
        } else {
            //java.util.Collections.sort(this.collectionOfRecords.getRecords());  to be changed for statistics
            for (StockRecord stock : this.collectionOfRecords.getRecords()) {
        		System.out.println("\t" + stock.toString());		    
        	}
        }		
    }
    
    /**
     * Helper method to display statistical data for stock records
     */
    public void displayStatisticalData() {
        System.out.println();
        	
        if (this.collectionOfRecords.getRecords().isEmpty()) {
            System.out.println("\tThere are no records in the list.");
        } else {
            //DO SOMETHING FOR STATS
            for (StockRecord stock : this.collectionOfRecords.getRecords()) {
        		System.out.println("\t" + stock.toString());		    
        	}
        }		
    }
}
