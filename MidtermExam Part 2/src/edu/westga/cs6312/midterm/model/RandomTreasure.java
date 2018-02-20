package edu.westga.cs6312.midterm.model;

import java.util.Random;

/**
 * This class models a random treasure chest by keeping track of its money units
 * 
 * @author Kent Kraus
 * @version 2018-02-19
 */
public class RandomTreasure extends TreasureChest {
    private Random random;
    
    /**
     * 1-parameter constructor to create a random treasure chest with 100 money units
     * 
     * @param random	a random object to initialize random treasure variables
     */
    public RandomTreasure(Random random) {
	super(100);
    }
    
    /**
     * Returns a description of the random treasure chest
     * 
     * @return	a description of the random chest
     */
    public String toString() {
        return "with random treasure chest holding 100 money units";
    }
    
    /**
     * Removes all the money from the random chest and returns the amount removed
     * 
     * @return	the amount of money removed from the random chest to be delivered as payment
     */
    @Override
    public int deliverPayment() {
    	this.random = new Random();
        int moneyToBeRemoved = this.random.nextInt(99) + 1;
        this.removeMoney(moneyToBeRemoved);
        return moneyToBeRemoved;
    }
}
