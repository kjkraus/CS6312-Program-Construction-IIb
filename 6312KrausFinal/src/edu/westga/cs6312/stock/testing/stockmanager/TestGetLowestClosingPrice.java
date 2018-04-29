package edu.westga.cs6312.stock.testing.stockmanager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.stock.model.StockManager;
import edu.westga.cs6312.stock.model.StockRecord;

class TestGetLowestClosingPrice {

    /**
     * Test to see if getLowestClosingPrice returns a value of 9.25
     */
    @Test
    void testGetLowestClosingPriceReturnsAValueOf925() {
        StockRecord theStockRecord = new StockRecord("2018-02-02", 9.25);
        StockRecord secondStockRecord = new StockRecord("1999-04-04", 12.55);
        StockManager theStockManager = new StockManager();
        theStockManager.addRecord(theStockRecord);
        theStockManager.addRecord(secondStockRecord);
        assertEquals("9.25", theStockManager.getLowestClosingPrice().toString());
    }
    
    /**
     * Test to see if getLowestClosingPrice returns a value of 78.25
     */
    @Test
    void testGetLowestClosingPriceReturnsAValueOf7825() {
        StockRecord theStockRecord = new StockRecord("2018-02-02", 78.25);
        StockRecord secondStockRecord = new StockRecord("1999-04-04", 92.55);
        StockRecord thirdStockRecord = new StockRecord("1999-04-04", 79.99);
        StockManager theStockManager = new StockManager();
        theStockManager.addRecord(theStockRecord);
        theStockManager.addRecord(secondStockRecord);
        theStockManager.addRecord(thirdStockRecord);
        assertEquals("78.25", theStockManager.getLowestClosingPrice().toString());
    }
    
    /**
     * Test to see if getLowestClosingPrice returns a value of 1.99
     */
    @Test
    void testGetLowestClosingPriceReturnsAValueOf199() {
        StockRecord theStockRecord = new StockRecord("2018-02-02", 2.25);
        StockRecord secondStockRecord = new StockRecord("1999-04-04", 1.99);
        StockRecord thirdStockRecord = new StockRecord("1999-04-04", 3.01);
        StockManager theStockManager = new StockManager();
        theStockManager.addRecord(theStockRecord);
        theStockManager.addRecord(secondStockRecord);
        theStockManager.addRecord(thirdStockRecord);
        assertEquals("1.99", theStockManager.getLowestClosingPrice().toString());
    }
}
