package edu.westga.cs6312.midterm.testing.simpletreasure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.midterm.model.SimpleTreasure;

class TestDeliverPayment {

    /**
     * Test to see if deliver payment returns the correct amount of money units
     */
    @Test
    public void testDeliverPaymentReturns75MoneyUnits() {
    	SimpleTreasure theSimpleTreasure = new SimpleTreasure();
    	assertEquals(75, theSimpleTreasure.deliverPayment());
    }

}
