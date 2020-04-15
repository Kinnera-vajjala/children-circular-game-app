package org.sv.util;

import org.apache.commons.lang3.Range;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessUtil {

    public static int process(Range<Integer> range) {

        int indexOfChild = 0;

        List<Integer> childsList = Stream.iterate(0, n -> n + 1).limit(range.getMaximum())
                .collect(Collectors.toList());

        while (childsList.size() > 1) {
            indexOfChild = (indexOfChild + range.getMinimum() - 1) % childsList.size();
            childsList.remove(indexOfChild);
        }

        return childsList.get(0);
    }
}
