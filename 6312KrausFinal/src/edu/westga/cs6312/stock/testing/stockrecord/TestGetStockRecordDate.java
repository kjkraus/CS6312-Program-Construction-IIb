package edu.westga.cs6312.stock.testing.stockrecord;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.stock.model.StockRecord;

class TestGetStockRecordDate {

    /**
     * Test stock record date accessor method returns 2017-07-07
     */
    @Test
    void testGetStockRecordDateReturns20170707() {
        StockRecord theStockRecord = new StockRecord("2017-07-07", 19.99);
        assertEquals("2017-07-07", theStockRecord.getStockRecordDate());
    }
    
    /**
     * Test stock record date accessor method returns 1911-11-11
     */
    @Test
    void testGetStockRecordDateReturns19111111() {
        StockRecord theStockRecord = new StockRecord("1911-11-11", 9.99);
        assertEquals("1911-11-11", theStockRecord.getStockRecordDate());
    }
    
    /**
     * Test stock record date accessor method returns 2022-02-02
     */
    @Test
    void testGetStockRecordDateReturns20220202() {
        StockRecord theStockRecord = new StockRecord("2022-02-02", 59.99);
        assertEquals("2022-02-02", theStockRecord.getStockRecordDate());
    }

}
