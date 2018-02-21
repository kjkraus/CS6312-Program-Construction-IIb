package edu.westga.cs6312.scores.view;

import java.util.Scanner;
import edu.westga.cs6312.scores.model.ScoreManager;

/**
 * This class displays the welcome message, menu, and accepts input options
 * 
 * @author Kent Kraus
 * @version 2018-02-21
 */
public class ScoreTUI {
    private Scanner input;
    private ScoreManager currentTestScores;
    
    /**
     * 1-parameter constructor to create the ScoreTUI object
     * 
     * @param	currentTestScores	a score manager that will keep track of test scores
     */
    public ScoreTUI(ScoreManager currentTestScores) {
        this.input = new Scanner(System.in);
        this.currentTestScores = currentTestScores;	
    }
    
    /**
     * Helper method to direct the flow of the application
     */
    public void run() {
        this.menuOptions();
    }
    
    /**
     * Helper method to display menu and manage user inputs
     */
    public void menuOptions() {
        System.out.println("\tWelcome to the Test Score Manager!");
        	
        int choice = 0;
        
        do {
            System.out.println();
            System.out.println("\t\t1 - Add a test score to the collection");
            System.out.println("\t\t2 - Print the list of test scores");
            System.out.println("\t\t3 - Quit");
            System.out.println();
            choice = this.getUserInt("Please enter your choice");
            if (choice == 1) {
                this.addScoreToCollection();
            } else if (choice == 2) {
                this.displayScores();
            } else if (choice == 3) {
                choice = 3;
            } else {
                System.out.println("\tThat is not a valid menu choice. Please try again.");
            }
            
        } while (choice != 3);
    	System.out.println();
    	System.out.println("\tThank you for using Test Score Manager.");
    	System.out.println("\tGoodbye!");
    }
    
    /**
     * Helper method to add a score to the collection
     */
    public void addScoreToCollection() {
	
    }
    
    /**
     * Helper method to display the list of scores
     */
    public void displayScores() {
	
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
}
