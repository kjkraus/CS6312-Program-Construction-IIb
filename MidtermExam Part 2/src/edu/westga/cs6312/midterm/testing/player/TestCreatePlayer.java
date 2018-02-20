package edu.westga.cs6312.midterm.testing.player;

import static org.junit.jupiter.api.Assertions.assertEquals;
import edu.westga.cs6312.midterm.model.Player;
import org.junit.jupiter.api.Test;

class TestCreatePlayer {
    /**
     * Test to see if 0-parameter constructor creates Player
     */
    @Test
    public void test0ParameterConstructorCreatesPlayer() {
    	Player thePlayer = new Player();
    	assertEquals("Player with 100 money units remaining", thePlayer.toString());
    }
}
