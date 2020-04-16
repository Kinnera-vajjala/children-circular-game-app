package org.sv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sv.model.InputData;
import org.sv.util.ProcessUtil;
import org.sv.util.ReadInputUtil;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.Scanner;

public class ChildrenCircularGameApp {

    private static final String YES_OPTION = "Y";

    private static final Logger log = LoggerFactory.getLogger(ChildrenCircularGameApp.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, String.valueOf(StandardCharsets.UTF_8));

        log.info("Start of Application");

        do {

            Optional<InputData> inputData = Optional.ofNullable(ReadInputUtil.readInput());

            if (inputData.isPresent()) {
                Integer idOfChild = ProcessUtil.process(inputData.get());
                log.info("ID of the Winning Child is : " + idOfChild);
            }

            log.info("Do you want to try again , please enter Y for Yes / N for No : ");

        } while (YES_OPTION.equalsIgnoreCase(scanner.next()));

        log.info("End of Application");

    }
}
