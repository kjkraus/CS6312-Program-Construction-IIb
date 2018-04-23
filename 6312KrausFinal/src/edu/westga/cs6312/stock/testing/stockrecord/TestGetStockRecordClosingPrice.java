package edu.westga.cs6312.stock.testing.stockrecord;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.stock.model.StockRecord;

class TestGetStockRecordClosingPrice {
    
    /**
     * Test accessor method returns 0.00
     */
    @Test
    void testGetStockRecordClosingPriceReturns000() {
        StockRecord theStockRecord = new StockRecord("1995-05-05", 0.00);
        assertEquals(0.00, theStockRecord.getStockClosingPrice());
    }

    /**
     * Test accessor method returns 1.11
     */
    @Test
    void testGetStockRecordClosingPriceReturns111() {
        StockRecord theStockRecord = new StockRecord("2018-01-01", 1.11);
        assertEquals(1.11, theStockRecord.getStockClosingPrice());
    }
    
    /**
     * Test accessor method returns 9999.95
     */
    @Test
    void testGetStockRecordClosingPriceReturns999995() {
        StockRecord theStockRecord = new StockRecord("2001-07-07", 9999.95);
        assertEquals(9999.95, theStockRecord.getStockClosingPrice());
    }

}
