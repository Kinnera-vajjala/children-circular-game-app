package org.sv.util;

import org.apache.commons.lang3.Range;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class ReadInputUtil {

    private static final Logger log = LoggerFactory.getLogger(ProcessUtil.class);
    private static int numberOfChildren;
    private static int count;


    public static Range<Integer> readInput() {

        Scanner scanner = new Scanner(System.in);

        //  prompt for the number of children
        System.out.println("Please input the number of children(n) : ");

        try {

            // get the input as an Integer
            numberOfChildren = scanner.nextInt();

            // prompt for the count
            System.out.print("Please input the count(k) for children circular game: ");

            // get the input as an Integer
            count = scanner.nextInt();

        } catch (Exception e) {
            log.error("Invalid data provided - please input Integer values only");
            return null;
        }

        log.info(String.format("Number of children in the game is %s, count for the game is %d", numberOfChildren, count));

        if (count > numberOfChildren) {
            log.info("Invalid input - count(k) cannot be greater than number of children(n)");
            return null;
        }

        return Range.between(numberOfChildren, count);

    }
}
