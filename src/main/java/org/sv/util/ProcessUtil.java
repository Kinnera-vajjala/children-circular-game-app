package org.sv.util;

import org.sv.model.InputData;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessUtil {

    public static int process(InputData inputData) {

        int indexOfChild = 0;

        List<Integer> childsList = Stream.iterate(0, i -> i + 1).limit(inputData.getNumberOfChildren())
                .collect(Collectors.toList());

        while (childsList.size() > 1) {
            indexOfChild = (indexOfChild + inputData.getCounter() - 1) % childsList.size();
            childsList.remove(indexOfChild);
        }

        return childsList.get(0);
    }
}
