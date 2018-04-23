package edu.westga.cs6312.files.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.files.model.TeamManager;

class TestCreateTeamManager {

    /**
     * Test to see if 0-parameter constructor creates TeamManager
     */
    @Test
    void test0ParameterConstructorCreatesTeamManager() {
        TeamManager theTeamManager = new TeamManager();
        assertEquals("\n\tThere are no teams recorded.", theTeamManager.toString());
	
    }

}
