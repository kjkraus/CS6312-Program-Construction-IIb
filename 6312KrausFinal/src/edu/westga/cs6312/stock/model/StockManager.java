package edu.westga.cs6312.stock.model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class will track one or more historical records about a particular stock
 * 
 * @author Kent Kraus
 * @version 2018-04-23
 */
public class StockManager {
    private ArrayList<StockRecord> listOfStockRecords;
    private String stockFileName;
    
    /**
     * 0-parameter constructor to create the StockManager object
     */
    public StockManager() {
        this.listOfStockRecords = new ArrayList<StockRecord>();
        this.stockFileName = "";
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

    /**
     * Accessor for the stock file name
     * 
     * @return	 the file name of the stock records
     */
    public String getFileName() {
        return this.stockFileName;
    }
    
    /**
     * Mutator for the stock file name
     * 
     * @param fileName	the file name of the stock records
     */
    public void setFileName(String fileName) {
        this.stockFileName = fileName;    	
    }
    
    /**
     * Helper method to return the highest closing price of the stock record collection
     * 
     * @return	highestClosingPrice	the closing price greater than all others in the collection
     */
    public Double getHighestClosingPrice() {
        ArrayList<Double> closingPrices = new ArrayList<Double>();
        for (StockRecord stock : this.listOfStockRecords) {
        	closingPrices.add(stock.getStockClosingPrice());
        }
        double highestClosingPrice = Collections.max(closingPrices);
        return highestClosingPrice;
    }
    
    /**
     * Helper method to return the lowest closing price of the stock record collection
     * 
     * @return	lowestClosingPrice	the closing price lower than all others in the collection
     */
    public Double getLowestClosingPrice() {
        ArrayList<Double> closingPrices = new ArrayList<Double>();
        for (StockRecord stock : this.listOfStockRecords) {
        	closingPrices.add(stock.getStockClosingPrice());
        }
        double lowestClosingPrice = Collections.min(closingPrices);
        return lowestClosingPrice;
    }
    
    /**
     * Helper method to return the average closing price of the stock record collection
     * 
     * @return	averageClosingPrice	the average closing price of the collection
     */
    public Double getAverageClosingPrice() {
        double averageClosingPrice;
        double total = 0.00;
        ArrayList<Double> closingPrices = new ArrayList<Double>();
        for (StockRecord stock : this.listOfStockRecords) {
        	closingPrices.add(stock.getStockClosingPrice());
        }
        for (int counter = 0; counter < closingPrices.size(); counter++) {
            total += closingPrices.get(counter);   
        }
        averageClosingPrice = total / closingPrices.size();
	
        return averageClosingPrice;
    }
    
    /**
     * Helper method to return all of the stock records being stored
     * 
     * @return	allRecords	all of the stock records being stored
     */
    public ArrayList<StockRecord> getAllRecords() {
        ArrayList<StockRecord> allRecords = this.listOfStockRecords;
        return allRecords;
    }
}
