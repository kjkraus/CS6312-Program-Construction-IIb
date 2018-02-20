package edu.westga.cs6312.midterm.testing.player;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.midterm.model.Player;

class TestGetPlayerMoney {
    
    /**
     * Test to get the number of money units for a newly created player
     */
    @Test
    public void testGetMoneyUnitsForANewPlayer() {
    	Player thePlayer = new Player();
    	assertEquals(100, thePlayer.getMoneyRemaining());
    }
    
    /**
     * Test to get the number of money units for a player who spent 1 unit
     */
    @Test
    public void testGetMoneyUnitsForNewPlayerWhoSpent1() {
    	Player thePlayer = new Player();
    	thePlayer.deductMoney(1);
    	assertEquals(99, thePlayer.getMoneyRemaining());
    }
    
    /**
     * Test to get the number of money units for a player who spent 50 units
     */
    @Test
    public void testGetMoneyUnitsForNewPlayerWhoSpent50() {
    	Player thePlayer = new Player();
    	thePlayer.deductMoney(50);
    	assertEquals(50, thePlayer.getMoneyRemaining());
    }
    
    /**
     * Test to get the number of money units for a player who received 11 units
     */
    @Test
    public void testGetMoneyUnitsForNewPlayerWhoReceived11() {
    	Player thePlayer = new Player();
    	thePlayer.acceptMoney(11);
    	assertEquals(111, thePlayer.getMoneyRemaining());
    }
    
    /**
     * Test to get the number of money units for a player who received 1999 units
     */
    @Test
    public void testGetMoneyUnitsForNewPlayerWhoReceived1999() {
    	Player thePlayer = new Player();
    	thePlayer.acceptMoney(1999);
    	assertEquals(2099, thePlayer.getMoneyRemaining());
    }
}
