package edu.westga.cs6312.stock.testing.stockmanager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.stock.model.StockManager;

class TestGetFileName {

    /**
     * Test to see if getFileName returns a value of ABCDEFG.csv
     */
    @Test
    void testGetFileNameReturnsAValueOfABCDEFGcsv() {
        StockManager theStockManager = new StockManager();
        theStockManager.setFileName("ABCDEFG.csv");
        assertEquals("ABCDEFG.csv", theStockManager.getFileName());
    }
    
    /**
     * Test to see if getFileName returns a value of 123456abc
     */
    @Test
    void testGetFileNameReturnsAValueOf123456abc() {
        StockManager theStockManager = new StockManager();
        theStockManager.setFileName("123456abc");
        assertEquals("123456abc", theStockManager.getFileName());
    }
    
    /**
     * Test to see if getFileName returns a value of MDB.csv
     */
    @Test
    void testGetFileNameReturnsAValueOfMDBcsv() {
        StockManager theStockManager = new StockManager();
        theStockManager.setFileName("MDB.csv");
        assertEquals("MDB.csv", theStockManager.getFileName());
    }

}
