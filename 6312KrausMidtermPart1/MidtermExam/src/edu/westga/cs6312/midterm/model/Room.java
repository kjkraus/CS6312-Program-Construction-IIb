package edu.westga.cs6312.midterm.model;

import java.util.Random;

/**
 * This class models a room that will keep track of an individual inside the game
 * 
 * @author Kent Kraus
 * @version 2018-02-18
 */
public class Room {
    private int idOfRoom;
    private TreasureChest roomTreasureChest;
    private Random random;
    
    /**
     * 2-parameter constructor to create a room and initialize its contents
     * 
     * @param id	the identifying number of the game
     * @param random	a random object to initialize room variables
     */
    public Room(int id, Random random) {
        this.idOfRoom = id;
        this.random = random;
        this.setUpRoom();
    }
    
    /**
     * Helper method to determine if treasure should be added to the room
     *   There is a 50% chance that treasure should be added
     */
    private void setUpRoom() {
        this.random = new Random();
        int chance = this.random.nextInt(99);
        if (chance >= 50) {
            this.roomTreasureChest = this.createTreasure();
        }
    }
    
    /**
     * Helper method to create and return a simple treasure
     */
    private SimpleTreasure createTreasure() {
        SimpleTreasure roomSimpleTreasure = new SimpleTreasure();
        return roomSimpleTreasure;
    }
    
    /**
     * Accessor method that returns identification of the room
     * 
     * @return	a String identifying the room's number
     */
    public String getLocation() {
        return "Room at position " + this.idOfRoom + " ";
    }
    
    /**
     * Accessor method that returns the treasure that is currently in the room
     * 
     * @return	a String of the treasure in the room
     */
    public String getTreasure() {
        if (this.roomTreasureChest == null) {
            return "with no treasure";
        } 
        return this.roomTreasureChest.toString();
    }
    
    /**
     * Returns a description of the room
     * 
     * @return	a String description of the room 
     */
    public String toString() {
        return "and is located in Room at position " + this.idOfRoom + " " + this.getTreasure();
    }
}
