package edu.westga.cs6312.stock.testing.stockmanager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.stock.model.StockManager;
import edu.westga.cs6312.stock.model.StockRecord;

class TestGetHighestClosingPrice {
    
    /**
     * Test to see if getHighestClosingPrice returns a value of 10.60
     */
    @Test
    void testGetHighestClosingPriceReturnsAValueOf1060() {
        StockRecord theStockRecord = new StockRecord("2018-05-01", 1.90);
        StockRecord secondStockRecord = new StockRecord("1999-12-09", 9.55);
        StockRecord thirdStockRecord = new StockRecord("1999-07-07", 10.60);
        StockManager theStockManager = new StockManager();
        theStockManager.addRecord(theStockRecord);
        theStockManager.addRecord(secondStockRecord);
        theStockManager.addRecord(thirdStockRecord);
        assertEquals("10.6", theStockManager.getHighestClosingPrice().toString());
    }
    
    /**
     * Test to see if getHighestClosingPrice returns a value of 599.55
     */
    @Test
    void testGetHighestClosingPriceReturnsAValueOf59955() {
        StockRecord theStockRecord = new StockRecord("2018-05-01", 349.90);
        StockRecord secondStockRecord = new StockRecord("1999-12-09", 599.55);
        StockRecord thirdStockRecord = new StockRecord("1999-07-07", 580.60);
        StockManager theStockManager = new StockManager();
        theStockManager.addRecord(theStockRecord);
        theStockManager.addRecord(secondStockRecord);
        theStockManager.addRecord(thirdStockRecord);
        assertEquals("599.55", theStockManager.getHighestClosingPrice().toString());
    }
    
    /**
     * Test to see if getHighestClosingPrice returns a value of 1.25
     */
    @Test
    void testGetHighestClosingPriceReturnsAValueOf125() {
        StockRecord theStockRecord = new StockRecord("2018-05-01", 0.99);
        StockRecord secondStockRecord = new StockRecord("1999-12-09", 1.05);
        StockRecord thirdStockRecord = new StockRecord("1999-07-07", 1.25);
        StockManager theStockManager = new StockManager();
        theStockManager.addRecord(theStockRecord);
        theStockManager.addRecord(secondStockRecord);
        theStockManager.addRecord(thirdStockRecord);
        assertEquals("1.25", theStockManager.getHighestClosingPrice().toString());
    }

}
