package edu.westga.cs6312.stock.model;

import java.util.ArrayList;

/**
 * This class will track one or more historical records about a particular stock
 * 
 * @author Kent Kraus
 * @version 2018-04-23
 */
public class StockManager {
    private ArrayList<StockRecord> listOfStockRecords;
    
    /**
     * 0-parameter constructor to create the StockManager object
     */
    public StockManager() {
        this.listOfStockRecords = new ArrayList<StockRecord>();
    }
    
    /**
     * Will accept a Stock Record object to be added to the collection
     * 
     * @param	currentRecord	a stock record to be added to the StockManager
     */
    public void addRecord(StockRecord currentRecord) {
        if (currentRecord == null) {
            throw new IllegalArgumentException("Stock record cannot be null. ");
        }
        this.listOfStockRecords.add(currentRecord);
    }
    
    /**
     * Accessor method will return a list of stock records
     * 
     * @return	a list of stock records
     */
    public ArrayList<StockRecord> getRecords() {
        return this.listOfStockRecords;
    }
    
    /**
     * Builds and returns an output of the list of records, one per line
     * 
     * @return	a String representation of the list of stock records
     */
    public String toString() {
        if (this.listOfStockRecords.isEmpty()) {
            String result = "\n\t There are no stock records recorded.";
            return result;
        }
        	
        String result = "";
        for (int counter = 0; counter < this.listOfStockRecords.size(); counter++) {
            result += "\n\t" + this.listOfStockRecords.get(counter);
        }
        return result;
    }
        
}
