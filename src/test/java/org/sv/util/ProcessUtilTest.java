package org.sv.util;

import org.apache.commons.lang3.Range;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ProcessUtilTest {

    @Test
    public void shouldProcessForNumberOfChildren10AndCount5() {
        int numberOfChildren = 10;
        int count = 5;
        int expectedWinnerID = 2;
        int winnerID = ProcessUtil.process(Range.between(numberOfChildren, count));
        assertEquals(expectedWinnerID, winnerID);
    }

    @Test
    public void shouldProcessForNumberOfChildren15AndCount3() {
        int numberOfChildren = 15;
        int count = 3;
        int expectedWinnerID = 4;
        int winnerID = ProcessUtil.process(Range.between(numberOfChildren, count));
        assertEquals(expectedWinnerID, winnerID);
    }


    @Test
    public void shouldProcessForNumberOfChildren3AndCount2() {
        int numberOfChildren = 3;
        int count = 2;
        int expectedWinnerID = 2;
        int winnerID = ProcessUtil.process(Range.between(numberOfChildren, count));
        assertEquals(expectedWinnerID, winnerID);
    }

    @Test
    public void shouldProcessForNumberOfChildren2AndCount2() {
        int numberOfChildren = 2;
        int count = 2;
        int expectedWinnerID = 0;
        int winnerID = ProcessUtil.process(Range.between(numberOfChildren, count));
        assertEquals(expectedWinnerID, winnerID);
    }

}
