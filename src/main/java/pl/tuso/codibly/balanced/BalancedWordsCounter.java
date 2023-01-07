package pl.tuso.codibly.balanced;

import java.util.HashSet;

public class BalancedWordsCounter {

    /**
     * Counts balanced subwords exist in the input word.
     *
     * @param input a String that is checked to find balanced subwords.
     * It must contain only letters, and it can't be null.
     * @return the count of balanced subwords in the input.
     */
    public int count(String input) {
        if (input == null) throw new NullPointerException("Input cannot be null!");
        if (!input.chars().allMatch(Character::isLetter)) throw new IllegalArgumentException("input must only be letters!");

        final StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                final HashSet<Long> times = new HashSet<>();
                stringBuilder.append(input.charAt(j));
                stringBuilder.chars().forEach(value -> times.add(stringBuilder.chars().filter(value1 -> value == value1).count()));
                if (times.size() == 1) counter++;
            }
            stringBuilder.setLength(0);
        }

        return counter;
    }
}
