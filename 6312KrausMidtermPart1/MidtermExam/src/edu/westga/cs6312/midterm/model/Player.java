package edu.westga.cs6312.midterm.model;

/**
 * This class models a player by keeping track of its money units
 * 
 * @author Kent Kraus
 * @version 2018-02-18
 */
public class Player {
    private int numberOfMoneyUnits;
    
    /**
     * A 0-parameter constructor to create a player with 100 money units
     */
    public Player() {
        this.numberOfMoneyUnits = 100;
    }
    
    /**
     * Returns the player's current money units
     * 
     * @return	the number of money units remaining for the player
     */
    public int getMoneyRemaining() {
        return this.numberOfMoneyUnits;
    }
    
    /**
     * Deducts from the player's current money units
     * 
     * @param spentUnits	the number of units to subtract from the player's current money units
     */
    public void deductMoney(int spentUnits) {
        this.numberOfMoneyUnits -= spentUnits;
    }
    
    /**
     * Adds to the player's current money units
     * 
     * @param givenUnits	the number of units to add to the player's current money units
     */
    public void acceptMoney(int givenUnits) {
        this.numberOfMoneyUnits += givenUnits;
    }
    
    /**
     * Returns a description of the player
     * 
     * @return	a description of the player
     */
    public String toString() {
        return "Player with " + this.numberOfMoneyUnits + " money units remaining";
    }
}
