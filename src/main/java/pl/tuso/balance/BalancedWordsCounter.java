package pl.tuso.balance;

import java.util.HashSet;
import java.util.Objects;

public class BalancedWordsCounter {
    public int count(String input) {
        Objects.requireNonNull(input, "input can not be null!");
        if (!input.chars().allMatch(Character::isLetter)) throw new IllegalArgumentException("input must only be letters!");
        StringBuilder stringBuilder = new StringBuilder(); // It's for the subwords
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                HashSet<Long> times = new HashSet<>();
                stringBuilder.append(input.charAt(j)).toString(); // Builds a subword
                stringBuilder.chars().forEach(value -> times.add(stringBuilder.chars().filter(value1 -> value == value1).count())); // Adds the number of character occurrences to the hash set
                if (times.size() == 1) counter++; // Checks if times size is equal 1 (if not, it means that there are other numbers)
            }
            stringBuilder.setLength(0); // Cleans the stringBuilder
        }
        return counter;
    }
}
