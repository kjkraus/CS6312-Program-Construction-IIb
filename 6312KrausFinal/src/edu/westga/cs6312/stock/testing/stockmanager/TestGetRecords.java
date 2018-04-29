package edu.westga.cs6312.stock.testing.stockmanager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.stock.model.StockManager;
import edu.westga.cs6312.stock.model.StockRecord;

class TestGetRecords {

    /**
     * Test to see if getRecords returns a value of 
     * Closed at 1.99 on 2018-01-01
     * Closed at 9.99 on 1999-09-09
     */
    @Test
    void testGetRecordsReturnsAValueOfTwoRecords() {
        StockRecord theStockRecord = new StockRecord("2018-01-01", 1.99);
        StockRecord secondStockRecord = new StockRecord("1999-09-09", 9.99);
        StockManager theStockManager = new StockManager();
        theStockManager.addRecord(theStockRecord);
        theStockManager.addRecord(secondStockRecord);
        assertEquals("[Closed at  $1.99 on 2018-01-01, Closed at  $9.99 on 1999-09-09]", theStockManager.getRecords().toString());
    }
    
    /**
     * Test to see if getRecords returns a value of 
     * Closed at 101.11 on 2002-11-12
     * Closed at 55.55 on 1742-09-09
     */
    @Test
    void testGetRecordsReturnsAValueOfAnotherTwoRecords() {
        StockRecord theStockRecord = new StockRecord("2002-11-12", 101.11);
        StockRecord secondStockRecord = new StockRecord("1742-09-09", 55.55);
        StockManager theStockManager = new StockManager();
        theStockManager.addRecord(theStockRecord);
        theStockManager.addRecord(secondStockRecord);
        assertEquals("[Closed at  $101.11 on 2002-11-12, Closed at  $55.55 on 1742-09-09]", theStockManager.getRecords().toString());
    }

}
