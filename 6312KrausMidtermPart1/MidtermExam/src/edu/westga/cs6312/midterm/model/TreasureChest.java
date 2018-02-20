package edu.westga.cs6312.midterm.model;

/**
 * This class models a treasure chest by keeping track of its money units
 * 
 * @author Kent Kraus
 * @version 2018-02-18
 */
public abstract class TreasureChest {
    private int chestMoneyUnits;
    
    /**
     * 1-parameter constructor to create a TreasureChest object
     * 
     * @param	moneyUnits	the number of money units inside the chest
     */
    public TreasureChest(int moneyUnits) {
        this.chestMoneyUnits = moneyUnits;
    }
    
    /**
     * Returns the number of money units inside the treasure chest
     * 
     * @return	number of money units left inside the treasure chest
     */
    public int getMoneyRemaining() {
        return this.chestMoneyUnits;
    }
    
    /**
     * Deducts from the chest's money units the amount of units removed
     * 
     * @param removedMoneyUnits		the number of money units removed from the chest
     */
    public void removeMoney(int removedMoneyUnits) {
        this.chestMoneyUnits -= removedMoneyUnits;
    }
    
    /**
     * Returns a description of the treasure chest
     * 
     * @return	a description of the treasure chest
     */
    public String toString() {
        return "no treasure";
    }
    
    /**
     * Returns the number of money units that will be taken out of the treasure chest
     * 
     * @return	the number of money units to be removed from the chest
     */
    public abstract int deliverPayment();
 
}

	
