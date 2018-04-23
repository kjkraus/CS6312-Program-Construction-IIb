package edu.westga.cs6312.files.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;
import edu.westga.cs6312.files.model.Team;
import edu.westga.cs6312.files.model.TeamManager;

/**
 * This class displays the welcome message, input options, and list of teams
 * 
 * @author Kent Kraus
 * @version 2018-03-04
 */
public class TeamTUI {
    private Scanner input;
    private TeamManager collectionOfTeams;
    
    /**
     * 1-parameter constructor to create a TeamTUI object
     * 
     * @param currentTeams	a collection of teams
     */
    public TeamTUI(TeamManager currentTeams) {
        if (currentTeams == null) {
            throw new IllegalArgumentException("The TeamManager object cannot be null. ");
        }
        this.input = new Scanner(System.in);
        this.collectionOfTeams = currentTeams;
    }
    
    /**
     * Helper method to begin the routine of the textual user interface
     */
    public void run() {
    	System.out.println("\tWelcome to the Team Manager application - now with files!");
    	int choice = 0;
    	
    	do {
            System.out.println();
            System.out.println("\t\t1 - Add Teams from a file");
            System.out.println("\t\t2 - Display sorted Teams on the console");
            System.out.println("\t\t3 - Save sorted Teams to a file");
            System.out.println("\t\t4 - Quit");
            System.out.println();
        
            choice = this.getUserInt("Please enter your choice");
            
            if (choice == 1) {
        	    this.addTeamsFromFile();
        	} else if (choice == 2) {
        	    this.displaySortedTeams(); 
        	} else if (choice == 3) {
        	    this.saveTeamsToFile(); 
        	} else if (choice < 1 || choice > 4) {
        	    System.out.println();
        	    System.out.println("\tThat's not a valid menu option. Please try again.");
        	}
        	
    	} while (choice != 4);
    	System.out.println();
    	System.out.println("\tThank you for using the Team Manager application.");
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
     * Helper method to add teams from a file
     */
    public void addTeamsFromFile() {
    	
        System.out.print("\tPlease enter the filename: ");
        String fileName = this.input.nextLine();
        File myFile = new File(fileName);
        Scanner inFile = null;
        
        try {
            inFile = new Scanner(myFile);
            inFile.useDelimiter(", *");
            while (inFile.hasNext()) {
                String teamName = (inFile.next());
        		    
                int wins = (inFile.nextInt());
                int losses = (inFile.nextInt());
                Team nextTeam = new Team(teamName, wins, losses);
                this.collectionOfTeams.addTeam(nextTeam);
                inFile.close();
            }  
       	    
       	    for (Team club : this.collectionOfTeams.getTeams()) {
       			System.out.println("\t" + club.toString());		    
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
     * Helper method to display sorted teams
     */
    public void displaySortedTeams() {
        System.out.println();
        	
        if (this.collectionOfTeams.getTeams().isEmpty()) {
            System.out.println("\tThere are no teams in the list.");
        } else {
            java.util.Collections.sort(this.collectionOfTeams.getTeams());
            for (Team club : this.collectionOfTeams.getTeams()) {
        		System.out.println("\t" + club.toString());		    
        	}
        }		
    }
    
    /**
     * Helper method to save teams to a file
     */
    public void saveTeamsToFile() {
        System.out.print("\tEnter output file name: ");
        String fileName = this.input.nextLine();
        File myFile = new File(fileName);
               
        try {
            PrintWriter outFile = new PrintWriter(myFile);
            for (Team club : this.collectionOfTeams.getTeams()) {
        		outFile.write(club.toString() + "\n");		    
            }
            System.out.println("\tTeams saved.");
            outFile.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("There was a problem with the file.");
        }
    }
}
