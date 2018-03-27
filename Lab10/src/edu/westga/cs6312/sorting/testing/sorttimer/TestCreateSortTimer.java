package edu.westga.cs6312.sorting.testing.sorttimer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.sorting.model.SortTimer;

class TestCreateSortTimer {

    /**
     * Test to see if 0-parameter constructor creates a sort timer
     *  with a timer on value of false
     */
    @Test
    void test0ParameterConstructorShouldBeTimerOnFalse() {
        SortTimer theSortTimer = new SortTimer();
        assertEquals("Timer on: false Timer difference: 0", theSortTimer.toString());
    }
}
