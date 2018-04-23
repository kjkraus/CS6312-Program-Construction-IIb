package edu.westga.cs6312.stock.testing.stockrecord;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.stock.model.StockRecord;

class TestCreateStockRecord {

    /**
     * Test to see if 2-parameter constructor creates a stock record
     *  with a closing price of 0.99 on date of '2018-01-01'
     */
    @Test
    void test2ParameterConstructorReturns099And20180101() {
        StockRecord theStockRecord = new StockRecord("2018-01-01", 0.99);
        assertEquals("Closed at 0.99 on 2018-01-01", theStockRecord.toString());
    }
    
    /**
     * Test to see if 2-parameter constructor creates a stock record
     *  with a closing price of 1000.01 on date of '2001-12-12'
     */
    @Test
    void test2ParameterConstructorReturns100001And20011212() {
        StockRecord theStockRecord = new StockRecord("2001-12-12", 1000.01);
        assertEquals("Closed at 1000.01 on 2001-12-12", theStockRecord.toString());
    }
    
    /**
     * Test to see if 2-parameter constructor creates a stock record
     *  with a closing price of 9.99 on date of '1999-06-30'
     */
    @Test
    void test2ParameterConstructorReturns999AND19990630() {
        StockRecord theStockRecord = new StockRecord("1999-06-30", 9.99);
        assertEquals("Closed at 9.99 on 1999-06-30", theStockRecord.toString());
    }

}
