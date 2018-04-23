package edu.westga.cs6312.stock.testing.stockmanager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.stock.model.StockManager;

class TestCreateStockManager {
    
    /**
     * Test to see if 0-parameter constructor creates StockManager
     */
    @Test
    void test0ParameterConstructorCreatesStockManager() {
        StockManager theStockManager = new StockManager();
        assertEquals("\n\t There are no stock records recorded.", theStockManager.toString());
    }
}
