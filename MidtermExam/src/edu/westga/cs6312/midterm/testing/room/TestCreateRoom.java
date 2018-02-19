package edu.westga.cs6312.midterm.testing.room;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Random;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.midterm.model.Room;

class TestCreateRoom {
    
    /**
     * Test to see if 2-parameter constructor creates a room at position 0
     */
    @Test
    public void test2ParameterConstructorCreatesRoomAtPosition0() {
        Random seed = new Random();
        Room theRoom = new Room(0, seed);
        assertEquals("and is located in Room at position 0", theRoom.toString());
    }
    
    /**
     * Test to see if 2-parameter constructor creates a room at position 2
     */
    @Test
    public void test2ParameterConstructorCreatesRoomAtPosition2() {
        Random seed = new Random();
        Room theRoom = new Room(2, seed);
        assertEquals("and is located in Room at position 2", theRoom.toString());
    }
    
    /**
     * Test to see if 2-parameter constructor creates a room at position 99
     */
    @Test
    public void test2ParameterConstructorCreatesRoomAtPosition99() {
        Random seed = new Random();
        Room theRoom = new Room(99, seed);
        assertEquals("and is located in Room at position 99", theRoom.toString());
    }
    
    /**
     * Test to see if 2-parameter constructor creates a room at position 1001
     */
    @Test
    public void test2ParameterConstructorCreatesRoomAtPosition1001() {
        Random seed = new Random();
        Room theRoom = new Room(1001, seed);
        assertEquals("and is located in Room at position 1001", theRoom.toString());
    }

}
