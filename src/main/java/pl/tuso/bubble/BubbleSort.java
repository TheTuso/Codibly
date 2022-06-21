package pl.tuso.bubble;

import java.util.*;
import java.util.stream.Collectors;

public class BubbleSort {
    public List<Number> sort(List<Number> input) { // I put a Number here so that I can use any type in the list, such as int or double
        Objects.requireNonNull(input, "input can not be null!"); // Checks if an input is null, if yes throws an exception
        input = input.stream().filter(integer -> integer != null).collect(Collectors.toList()); // Removes null values from the list
        for (int i = 0; i < input.size() - 1; i++) {
            for (int j = 0; j < input.size() - i - 1; j++) {
                if (input.get(j + 1).doubleValue() < input.get(j).doubleValue()) { // I use doubleValue() here for decimals
                    Collections.swap(input, j, j + 1); // Swaps the values
                }
            }
        }
        return input;
    }
}
