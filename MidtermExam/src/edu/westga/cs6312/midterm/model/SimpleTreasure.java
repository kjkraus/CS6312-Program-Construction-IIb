package edu.westga.cs6312.midterm.model;


/**
 * This class models a simple treasure chest by keeping track of its money units
 * 
 * @author Kent Kraus
 * @version 2018-02-18
 */
public abstract class SimpleTreasure extends TreasureChest {
    
    /**
     * 0-parameter constructor to create a simple treasure chest with 75 money units
     */
    public SimpleTreasure() {
	super(75);
    }
    
    /**
     * Returns a description of the simple treasure chest
     * 
     * @return	a description of the simple chest
     */
    public String toString() {
        return "simple " + super.toString();
    }
    
    /**
     * Removes all the money from the chest and returns the amount removed
     * 
     * @return	the amount of money removed from the chest to be delivered as payment
     */
    @Override
    public int deliverPayment() {
        int moneyToBeRemoved = this.getMoneyRemaining();
        this.removeMoney(moneyToBeRemoved);
        return moneyToBeRemoved;
    }   
}

