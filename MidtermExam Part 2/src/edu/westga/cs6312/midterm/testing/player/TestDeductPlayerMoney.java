package edu.westga.cs6312.midterm.testing.player;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.midterm.model.Player;

class TestDeductPlayerMoney {

    /**
     * Test to confirm deducting 0 money units will produce a value of 100
     */
    @Test
    public void testDeducting0UnitsProducesRemainingUnitsOf100() {
        Player thePlayer = new Player();
        thePlayer.deductMoney(0);
    	assertEquals("Player with 100 money units remaining", thePlayer.toString());
    }
    
    /**
     * Test to confirm deducting 1 money units will produce a value of 101
     */
    @Test
    public void testDeducting1UnitProducesRemainingUnitsOf99() {
        Player thePlayer = new Player();
        thePlayer.deductMoney(1);
    	assertEquals("Player with 99 money units remaining", thePlayer.toString());
    }
    
    /**
     * Test to confirm deducting 33 money units will produce a value of 133
     */
    @Test
    public void testDeducting33UnitsProducesRemainingUnitsOf67() {
        Player thePlayer = new Player();
        thePlayer.deductMoney(33);
    	assertEquals("Player with 67 money units remaining", thePlayer.toString());
    }
    
    /**
     * Test to confirm deducting 100 money units will produce a value of 200
     */
    @Test
    public void testDeducting100UnitsProducesRemainingUnitsOf0() {
        Player thePlayer = new Player();
        thePlayer.deductMoney(100);
    	assertEquals("Player with 0 money units remaining", thePlayer.toString());
    }
    
    /**
     * Test to confirm deducting 901 money units will produce a value of 1001
     */
    @Test
    public void testDeducting501UnitsProducesRemainingUnitsOfNegative401() {
        Player thePlayer = new Player();
        thePlayer.deductMoney(501);
    	assertEquals("Player with -401 money units remaining", thePlayer.toString());
    }

}
