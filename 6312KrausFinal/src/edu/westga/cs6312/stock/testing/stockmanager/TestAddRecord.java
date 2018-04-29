package edu.westga.cs6312.stock.testing.stockmanager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.stock.model.StockManager;
import edu.westga.cs6312.stock.model.StockRecord;

class TestAddRecord {
    
    /**
     * Test to see if addRecord returns a value of 
     * Closed at 1.99 on 2018-01-01
     */
    @Test
    void testAddRecordReturnsAValueOfClosedAt199On20180101() {
        StockRecord theStockRecord = new StockRecord("2018-01-01", 1.99);
        StockManager theStockManager = new StockManager();
        theStockManager.addRecord(theStockRecord);
        assertEquals("\n\tClosed at  $1.99 on 2018-01-01", theStockManager.toString());
    }
    
    /**
     * Test to see if addRecord returns a value of 
     * Closed at 999.99 on 1888-12-12
     */
    @Test
    void testAddRecordReturnsAValueOfClosedAt99999On18881212() {
        StockRecord theStockRecord = new StockRecord("1888-12-12", 999.99);
        StockManager theStockManager = new StockManager();
        theStockManager.addRecord(theStockRecord);
        assertEquals("\n\tClosed at  $999.99 on 1888-12-12", theStockManager.toString());
    }
    
    /**
     * Test to see if addRecord returns a value of 
     * Closed At 55.55 on 2005-05-50
     * Closed At 8.88 on 1801-10-11
     */
    @Test
    void testAddRecordReturnsAValueOfTwoRecords() {
        StockRecord theStockRecord = new StockRecord("2005-05-05", 55.55);
        StockRecord secondStockRecord = new StockRecord("1801-10-11", 8.88);
        StockManager theStockManager = new StockManager();
        theStockManager.addRecord(theStockRecord);
        theStockManager.addRecord(secondStockRecord);
        assertEquals("\n\tClosed at  $55.55 on 2005-05-05\n\tClosed at  $8.88 on 1801-10-11", theStockManager.toString());
    }

}
