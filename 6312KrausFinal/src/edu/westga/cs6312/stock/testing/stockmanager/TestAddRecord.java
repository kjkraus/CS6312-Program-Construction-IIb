package edu.westga.cs6312.stock.testing.stockmanager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.stock.model.StockManager;
import edu.westga.cs6312.stock.model.StockRecord;

class TestAddRecord {
    
    /**
     * Test to see if addRecord returns a value of ...
     */
    @Test
    void testAddRecordReturnsAValueOfAAA() {
        StockRecord theStockRecord = new StockRecord("2018-01-01", 1.99);
        StockManager theStockManager = new StockManager();
        theStockManager.addRecord(theStockRecord);
        assertEquals("", theStockManager.toString());
    }
    
    /**
     * Test to see if addRecord returns a value of ...
     */
    @Test
    void testAddRecordReturnsAValueOfBBB() {
        StockRecord theStockRecord = new StockRecord("1888-12-12", 999.99);
        StockManager theStockManager = new StockManager();
        theStockManager.addRecord(theStockRecord);
        assertEquals("", theStockManager.toString());
    }
    
    /**
     * Test to see if addRecord returns a value of ...
     */
    @Test
    void testAddRecordReturnsAValueOfCCC() {
        StockRecord theStockRecord = new StockRecord("2005-05-05", 55.55);
        StockManager theStockManager = new StockManager();
        theStockManager.addRecord(theStockRecord);
        assertEquals("", theStockManager.toString());
    }

}
