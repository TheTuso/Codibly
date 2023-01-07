package pl.tuso.codibly.bubble;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSort {

    /**
     * Sorts {@code List} of {@code Comparable} elements using Bubble Sort algorithm.
     *
     * @param input a {@code List} of {@code Comparable} that is sorted using Bubble Sort algorithm. It can't be null.
     * @return a {@code List} of {@code Comparable} sorted in ascending order.
     */
    public <T extends Comparable> List<T> sort(List<T> input) {
        if (input == null) throw new NullPointerException("Input cannot be null!");

        input = input.stream().filter(comparable -> comparable != null).collect(Collectors.toList());

        for (int i = 0; i < input.size() - 1; i++) {
            for (int j = 0; j < input.size() - i - 1; j++) {
                if (input.get(j + 1).compareTo(input.get(j)) >= 0) continue;
                Collections.swap(input, j, j + 1);
            }
        }

        return input;
    }
}
