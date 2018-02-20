package edu.westga.cs6312.midterm.testing.room;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Random;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.midterm.model.Room;

class TestGetLocationRoom {

    /**
     * Test to see if getLocation returns a room at position 0
     */
    @Test
    public void testGetLocationReturnsRoomAtLocation0() {
        Random seed = new Random();
        Room theRoom = new Room(0, seed);
        assertEquals("Room at position 0 ", theRoom.getLocation());
    }
    
    /**
     * Test to see if getLocation returns a room at position 1
     */
    @Test
    public void testGetLocationReturnsRoomAtLocation1() {
        Random seed = new Random();
        Room theRoom = new Room(1, seed);
        assertEquals("Room at position 1 ", theRoom.getLocation());
    }
    
    /**
     * Test to see if getLocation returns a room at position 55
     */
    @Test
    public void testGetLocationReturnsRoomAtLocation55() {
        Random seed = new Random();
        Room theRoom = new Room(55, seed);
        assertEquals("Room at position 55 ", theRoom.getLocation());
    }
    
    /**
     * Test to see if getLocation returns a room at position 1999
     */
    @Test
    public void testGetLocationReturnsRoomAtLocation1999() {
        Random seed = new Random();
        Room theRoom = new Room(1999, seed);
        assertEquals("Room at position 1999 ", theRoom.getLocation());
    }

}
