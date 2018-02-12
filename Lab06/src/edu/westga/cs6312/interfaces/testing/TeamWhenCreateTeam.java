package edu.westga.cs6312.interfaces.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import edu.westga.cs6312.interfaces.model.Team;

class TeamWhenCreateTeam {

    /**
     * Test to see if 1-parameter constructor creates team
     *  with name Alabama and 0 wins 0 losses
     */
    @Test
    void test1ParameterConstructorShouldBeAlabamaWith0Wins0Losses() {
        Team theTeam = new Team("Alabama");
        assertEquals("The team, Alabama, has 0 wins and 0 losses.", theTeam.toString());
    }
    
    /**
     * Test to see if 1-parameter constructor creates team
     *  with name 1100011 and 0 wins 0 losses
     */
    @Test
    void test1ParameterConstructorShouldBe1100011With0Wins0Losses() {
        Team theTeam = new Team("1100011");
        assertEquals("The team, 1100011, has 0 wins and 0 losses.", theTeam.toString());
    }
    
    /**
     * Test to see if 3-parameter constructor creates team
     *  with name Ukraine and 999 wins 1001 losses
     */
    @Test
    void test3ParameterConstructorShouldBeUkraineWith999Wins1001Losses() {
        Team theTeam = new Team("Ukraine", 999, 1001);
        assertEquals("The team, Ukraine, has 999 wins and 1001 losses.", theTeam.toString());
    }
    
    /**
     * Test to see if 3-parameter constructor creates team
     *  with name Paraguay and 1 wins 500 losses
     */
    @Test
    void test3ParameterConstructorShouldBeParaguayWith1Wins500Losses() {
        Team theTeam = new Team("Paraguay", 1, 500);
        assertEquals("The team, Paraguay, has 1 wins and 500 losses.", theTeam.toString());
    }
    
    /**
     * Test to see if 3-parameter constructor creates team
     *  with name Junior Tiger Baseball and 10 wins 0 losses
     */
    @Test
    void test3ParameterConstructorShouldBeJuniorTigerBaseballWith10Wins0Losses() {
        Team theTeam = new Team("Junior Tiger Baseball", 10, 0);
        assertEquals("The team, Junior Tiger Baseball, has 10 wins and 0 losses.", theTeam.toString());
    }

}
