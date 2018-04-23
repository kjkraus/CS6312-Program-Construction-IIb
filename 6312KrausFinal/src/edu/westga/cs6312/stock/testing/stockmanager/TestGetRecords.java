package edu.westga.cs6312.stock.testing.stockmanager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.stock.model.StockManager;
import edu.westga.cs6312.stock.model.StockRecord;

class TestGetRecords {

    /**
     * Test to see if addRecord returns a value of ...
     */
    @Test
    void testAddRecordReturnsAValueOfAAA() {
        StockRecord theStockRecord = new StockRecord("2018-01-01", 1.99);
        StockRecord secondStockRecord = new StockRecord("1999-09-09", 9.99);
        StockManager theStockManager = new StockManager();
        theStockManager.addRecord(theStockRecord);
        theStockManager.addRecord(secondStockRecord);
        assertEquals("", theStockManager.toString());
    }

}
