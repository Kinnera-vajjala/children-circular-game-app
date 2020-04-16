package org.sv.util;

import org.junit.Before;
import org.junit.Test;
import org.sv.model.InputData;

import static org.junit.Assert.assertEquals;


public class ProcessUtilTest {

    private InputData inputData;

    @Before
    public void setUp() {
        inputData = new InputData();
    }

    @Test
    public void shouldProcessForNumberOfChildren10AndCounter5() {
        int expectedWinnerID = 2;
        int winnerID = ProcessUtil.process(getInputData(10, 5));
        assertEquals(expectedWinnerID, winnerID);
    }

    @Test
    public void shouldProcessForNumberOfChildren15AndCounter3() {
        int expectedWinnerID = 4;
        int winnerID = ProcessUtil.process(getInputData(15, 3));
        assertEquals(expectedWinnerID, winnerID);
    }


    //Test for n greater than k
    @Test
    public void shouldProcessForNumberOfChildren3AndCounter2() {
        int expectedWinnerID = 2;
        int winnerID = ProcessUtil.process(getInputData(3, 2));
        assertEquals(expectedWinnerID, winnerID);
    }

    //Test for n equal to k
    @Test
    public void shouldProcessForNumberOfChildren2AndCounter2() {
        int expectedWinnerID = 0;
        int winnerID = ProcessUtil.process(getInputData(2, 2));
        assertEquals(expectedWinnerID, winnerID);
    }

    //Test for n less than k
    @Test
    public void shouldProcessForNumberOfChildren2AndCounter3() {
        int expectedWinnerID = 1;
        int winnerID = ProcessUtil.process(getInputData(2, 3));
        assertEquals(expectedWinnerID, winnerID);
    }

    private InputData getInputData(int numberOfChildren, int counter) {
        inputData.setNumberOfChildren(numberOfChildren);
        inputData.setCounter(counter);
        return inputData;
    }

}
