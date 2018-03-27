package edu.westga.cs6312.sorting.testing.sorttimer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.sorting.model.SortTimer;

class TestStartTimer {

    /**
     * Test to see if start timer has a true on value 
     */
    @Test
    void testStartTimerShouldReturnTimeOnTrue() {
        SortTimer theSortTimer = new SortTimer();
        theSortTimer.startTimer();
        assertEquals("Timer on: true Timer difference: 0", theSortTimer.toString());
    }    
}
