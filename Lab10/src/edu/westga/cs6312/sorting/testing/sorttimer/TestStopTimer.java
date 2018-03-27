package edu.westga.cs6312.sorting.testing.sorttimer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.sorting.model.SortTimer;

class TestStopTimer {

    /**
     * Test to see if stop timer has a false on value 
     */
    @Test
    void testSopTimerShouldReturnTimeOnFalse() {
        SortTimer theSortTimer = new SortTimer();
        theSortTimer.stopTimer();
        assertEquals("Timer on: false Timer difference: 0", theSortTimer.toString());
    }
}
