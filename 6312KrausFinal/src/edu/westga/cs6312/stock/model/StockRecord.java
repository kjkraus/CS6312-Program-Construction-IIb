package edu.westga.cs6312.stock.model;

/**
 * This class will track the information about a particular stock on a given day
 * 
 * @author Kent Kraus
 * @version 2018-04-23
 */
public class StockRecord {
    private String stockRecordDate;
    private double stockClosingPrice;
    
    /**
     * A 2-parameter constructor to create a StockRecord object
     * 
     * @param date	The date of the stock record
     * @param price	The closing price of the date of the stock record
     */
    public StockRecord(String date, double price) {
        if (date == null) {
            throw new IllegalArgumentException("Stock record date cannot be null. ");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Stock closing price cannot be less than 0. ");
        }
        this.stockRecordDate = date;
        this.stockClosingPrice = price;
    }
    
    /**
     * Returns a String description of the stock record
     * 
     * @return	a description of the stock record
     */
    public String toString() {
        return "Closed at " + this.stockClosingPrice + " on " + this.stockRecordDate;
    }
    
    /**
     * Accessor for the stock record date
     * 
     * @return	 the record date
     */
    public String getStockRecordDate() {
        return this.stockRecordDate;
    }
    
    /**
     * Accessor for the stock record closing price
     * 
     * @return	 the record closing price
     */
    public double getStockClosingPrice() {
        return this.stockClosingPrice;
    }
}


