package edu.westga.cs6312.midterm.testing.player;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.midterm.model.Player;

class TestAddPlayerMoney {
    
    /**
     * Test to confirm adding 0 money units will produce a value of 100
     */
    @Test
    public void testAdding0UnitsProducesRemainingUnitsOf100() {
        Player thePlayer = new Player();
        thePlayer.acceptMoney(0);
    	assertEquals("Player with 100 money units remaining", thePlayer.toString());
    }
    
    /**
     * Test to confirm adding 1 money units will produce a value of 101
     */
    @Test
    public void testAdding1UnitProducesRemainingUnitsOf101() {
        Player thePlayer = new Player();
        thePlayer.acceptMoney(1);
    	assertEquals("Player with 101 money units remaining", thePlayer.toString());
    }
    
    /**
     * Test to confirm adding 33 money units will produce a value of 133
     */
    @Test
    public void testAdding33UnitsProducesRemainingUnitsOf133() {
        Player thePlayer = new Player();
        thePlayer.acceptMoney(33);
    	assertEquals("Player with 133 money units remaining", thePlayer.toString());
    }
    
    /**
     * Test to confirm adding 100 money units will produce a value of 200
     */
    @Test
    public void testAdding100UnitsProducesRemainingUnitsOf200() {
        Player thePlayer = new Player();
        thePlayer.acceptMoney(100);
    	assertEquals("Player with 200 money units remaining", thePlayer.toString());
    }
    
    /**
     * Test to confirm adding 901 money units will produce a value of 1001
     */
    @Test
    public void testAdding901UnitsProducesRemainingUnitsOf1001() {
        Player thePlayer = new Player();
        thePlayer.acceptMoney(901);
    	assertEquals("Player with 1001 money units remaining", thePlayer.toString());
    }       
}
