package edu.westga.cs6312.files.view;

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
     */
    public TeamTUI() {
        this.input = new Scanner(System.in);
        this.collectionOfTeams = new TeamManager();
    }
    
    /**
     * Helper method to begin the routine of the textual user interface
     */
    public void run() {
    	System.out.println("\tWelcome to the Team Collection application - now with files!");
    	int choice = 0;
    	
    	do {
            System.out.println();
            System.out.println("\t\t1 - Add Teams from a file");
            System.out.println("\t\t2 - Display sorted Teams on the console");
            System.out.println("\t\t3 - Save sorted Teams to a file");
            System.out.println("\t\t4 - Quit");
            System.out.println();
        
            System.out.print("\tEnter your choice: ");
            String enteredChoice = this.input.nextLine();
            choice = Integer.parseInt(enteredChoice);
            
            if (choice == 1) {
        	    this.addTeam();
        	} else if (choice == 2) {
        	    this.getTeams(); 
        	} else if (choice == 3) {
        	    this.saveTeams(); 
        	} else if (choice < 1 || choice > 4) {
        	    System.out.println();
        	    System.out.println("\tThat's not a valid choice. Please try again.");
        	}
        	
    	} while (choice != 4);
    	System.out.println();
    	System.out.println("\tThank you for using the Team Collection application.");
    	System.out.println("\tGoodbye!");
    }
}
