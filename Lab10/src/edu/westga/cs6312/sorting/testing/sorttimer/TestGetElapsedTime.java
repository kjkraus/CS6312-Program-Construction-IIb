package edu.westga.cs6312.sorting.testing.sorttimer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;
import edu.westga.cs6312.sorting.model.SortTimer;

class TestGetElapsedTime {

    /**
     * Test to see if elapsed time with no start time
     *  equals 0
     */
    @Test
    void testEllapsedTimeIfNoStartTime() {
        SortTimer theSortTimer = new SortTimer();
        assertEquals(0, (int) theSortTimer.getElapsedTime());
    }
    
    /**
     * Test to see if elapsed time with no end time
     *  equals 0
     */
    @Test
    void testEllapsedTimeIfNoEndTime() {
        SortTimer theSortTimer = new SortTimer();
        theSortTimer.startTimer();
        assertEquals(0, (int) theSortTimer.getElapsedTime());
    }
    
    /**
     * Test to see if elapsed time equals the difference between a start and end time
     */
    @Test
    void testEllapsedTimeIsDifferenceBetweenStartAndEndTime() {
        SortTimer theSortTimer = new SortTimer();
        theSortTimer.startTimer();
        theSortTimer.stopTimer();
        Instant theEndTime = theSortTimer.getEndTime();
        Instant theStartTime = theSortTimer.getStartTime();
        long difference = ChronoUnit.MILLIS.between(theStartTime, theEndTime);
        assertEquals(difference, theSortTimer.getElapsedTime());
    }
}
