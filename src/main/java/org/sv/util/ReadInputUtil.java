package org.sv.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sv.model.InputData;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ReadInputUtil {

    private static final Logger log = LoggerFactory.getLogger(ProcessUtil.class);

    public static InputData readInput() {

        // FindBugs suggests to use UTF-8 encoding for reading input .
        // This makes the parsing independent of the machine on which program is executed.
        Scanner scanner = new Scanner(System.in, String.valueOf(StandardCharsets.UTF_8));
        InputData inputData = new InputData();

        //  prompt for the number of children
        log.info("Please input the number of children(n) : ");

        try {

            // get the input as an Integer
            inputData.setNumberOfChildren(scanner.nextInt());

            // prompt for the Counter
            log.info("Please input the counter(k) for children circular game: ");

            // get the input as an Integer
            inputData.setCounter(scanner.nextInt());

        } catch (Exception e) {
            log.error("Invalid data provided - please input Integer values only");
            return null;
        }

        log.info(String.format("Number of children in the game is %s, counter for the game is %d",
                inputData.getNumberOfChildren(), inputData.getCounter()));

        return inputData;

    }
}
