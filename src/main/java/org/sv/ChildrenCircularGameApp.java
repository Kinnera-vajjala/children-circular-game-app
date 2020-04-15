package org.sv;

import org.apache.commons.lang3.Range;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sv.util.ProcessUtil;
import org.sv.util.ReadInputUtil;

import java.util.Optional;
import java.util.Scanner;

public class ChildrenCircularGameApp {

    private static final String YES_OPTION = "Y";

    private static final Logger log = LoggerFactory.getLogger(ChildrenCircularGameApp.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        log.info("Start of Application");

        do {

            Optional<Range<Integer>> range = Optional.ofNullable(ReadInputUtil.readInput());

            if (range.isPresent()) {
                Integer idOfChild = ProcessUtil.process(range.get());
                log.info("ID of the Winning Child is : " + idOfChild);
            }

            System.out.println("Do you want to try again , please enter Y for Yes / N for No : ");

        } while (YES_OPTION.equalsIgnoreCase(scanner.next()));

        log.info("End of Application");

    }
}
