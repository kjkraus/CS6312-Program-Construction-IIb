package edu.westga.cs6312.interfaces.view;

import java.util.ArrayList;
import java.util.Scanner;
import edu.westga.cs6312.interfaces.model.Team;

/**
 * This class displays the welcome message, input options, and list of teams
 * 
 * @author Kent Kraus
 * @version 2018-02-11
 */
public class TeamTUI {
    private Scanner input;
    private ArrayList<Team> listOfTeams;
    
    /**
     * 0-parameter constructor to create a TeamTUI object
     */
    public TeamTUI() {
        this.input = new Scanner(System.in);
        this.listOfTeams = new ArrayList<Team>();
    }
    
    /**
     * Helper method to begin the routine of the textual user interface
     */
    public void run() {
    	System.out.println("\tWelcome to the Team Collection application!");
    	int choice = 0;
    	
    	do {
            System.out.println();
            System.out.println("\t\t1 - Add a Team to the list");
            System.out.println("\t\t2 - Describe the Teams in the list");
            System.out.println("\t\t3 - Quit");
            System.out.println();
        
            System.out.print("\tEnter your choice: ");
            String enteredChoice = this.input.nextLine();
            choice = Integer.parseInt(enteredChoice);
            
            if (choice == 1) {
        	    this.addTeam();
        	} else if (choice == 2) {
        	    this.listAllTeams(); 
        	} else if (choice < 1 || choice > 3) {
        	    System.out.println();
        	    System.out.println("\tThat's not a valid choice. Please try again.");
        	}
        	
    	} while (choice != 3);
    	System.out.println();
    	System.out.println("\tThank you for using the Team Collection application.");
    	System.out.println("\tGoodbye!");
    }
    
    /**
     * Helper method to display the list of Teams.
     */
    private void listAllTeams() {
		System.out.println();
		
		if (this.listOfTeams.size() == 0) {
		    System.out.println("\tThere are no teams in the list.");
		} else {
		    java.util.Collections.sort(this.listOfTeams);
		    for (Team club : this.listOfTeams) {
        	    System.out.println("\t" + club.describe());		    
			}
		}		
	}
    
    /**
     * Helper method to add an animal to the list
     */
    public void addTeam() {
        System.out.println();
        System.out.print("\tEnter the Team you would like to add: ");
        String givenTeam = this.input.nextLine();
        
        System.out.print("\tEnter the number of wins: ");
        String wins = this.input.nextLine();
        int givenWins = Integer.parseInt(wins);
        
        System.out.print("\tEnter the number of losses: ");
        String losses = this.input.nextLine();
        int givenLosses = Integer.parseInt(losses);
        
        if ((givenWins < 0) || (givenLosses < 0)) {
            System.out.println("\tYou did not enter a valid number of games!");
        } else {
            this.listOfTeams.add(new Team(givenTeam, givenWins, givenLosses));
            System.out.println();
            System.out.println("\tYour team was added to the collection.");      
        }
    }
}


