package main.resources.com.wyattburkhardt.primegen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InputParser {
    public List<Integer> range;

    public InputParser(String input) {
        range = parseInputToRangeIntegers(input);
    }

    private List<Integer> parseInputToRangeIntegers(String input) {
        List<String> parts = Arrays.asList(input.split("(?:[.]{3})"));
        List<String> cleanedValues = removeEmptyStrings(parts);
        List<Integer> partsAsInts = convertList(cleanedValues, Integer::parseInt);
        Collections.sort(partsAsInts);
        return partsAsInts;
    }

    private static <T, U> List<U> convertList(List<T> from, Function<T, U> func) {
        return from.stream().map(func).collect(Collectors.toList());
    }

    private List<String> removeEmptyStrings(List<String> strings) {
        return strings.stream()
                .filter(item -> !item.isEmpty())
                .collect(Collectors.toList());
    }
}
