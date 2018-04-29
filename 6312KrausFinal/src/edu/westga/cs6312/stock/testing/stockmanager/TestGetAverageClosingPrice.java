package edu.westga.cs6312.stock.testing.stockmanager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.stock.model.StockManager;
import edu.westga.cs6312.stock.model.StockRecord;

class TestGetAverageClosingPrice {

    /**
     * Test to see if getAverageClosingPrice returns a value of 20.0
     */
    @Test
    void testGetAverageClosingPriceReturnsAValueOf200() {
        StockRecord theStockRecord = new StockRecord("2018-01-01", 10.00);
        StockRecord secondStockRecord = new StockRecord("1999-09-09", 20.00);
        StockRecord thirdStockRecord = new StockRecord("1999-11-11", 30.00);
        StockManager theStockManager = new StockManager();
        theStockManager.addRecord(theStockRecord);
        theStockManager.addRecord(secondStockRecord);
        theStockManager.addRecord(thirdStockRecord);
        assertEquals("20.0", theStockManager.getAverageClosingPrice().toString());
    }
    
    /**
     * Test to see if getAverageClosingPrice returns a value of 155.49
     */
    @Test
    void testGetAverageClosingPriceReturnsAValueOf15549() {
        StockRecord theStockRecord = new StockRecord("2018-01-01", 100.99);
        StockRecord secondStockRecord = new StockRecord("1999-09-09", 209.99);
        StockManager theStockManager = new StockManager();
        theStockManager.addRecord(theStockRecord);
        theStockManager.addRecord(secondStockRecord);
        assertEquals("155.49", theStockManager.getAverageClosingPrice().toString());
    }
    
    /**
     * Test to see if getAverageClosingPrice returns a value of 351.0
     */
    @Test
    void testGetAverageClosingPriceReturnsAValueOf3510() {
        StockRecord theStockRecord = new StockRecord("2018-05-01", 101.90);
        StockRecord secondStockRecord = new StockRecord("1999-12-09", 298.50);
        StockRecord thirdStockRecord = new StockRecord("1999-07-07", 652.60);
        StockManager theStockManager = new StockManager();
        theStockManager.addRecord(theStockRecord);
        theStockManager.addRecord(secondStockRecord);
        theStockManager.addRecord(thirdStockRecord);
        assertEquals("351.0", theStockManager.getAverageClosingPrice().toString());
    }

}
