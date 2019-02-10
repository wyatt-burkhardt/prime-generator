package main.resources.com.wyattburkhardt.primegen;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InputParser {
    public List<Integer> range;

    public InputParser(String input) {
        range = parseInputToIntegers(input);
    }

    public List<Integer> parseInputToIntegers(String input) {
        List<String> parts = Arrays.asList(input.split("(?:[.]{3})"));
        List<String> cleanedValues = removeEmptyStrings(parts);
        List<Integer> partsAsInts = convertList(cleanedValues, s -> Integer.parseInt(s));
        return partsAsInts;
    }

    public static <T, U> List<U> convertList(List<T> from, Function<T, U> func) {
        return from.stream().map(func).collect(Collectors.toList());
    }

    private List<String> removeEmptyStrings(List<String> strings) {
        List<String> cleaned = strings.stream()
                .filter(item -> !item.isEmpty())
                .collect(Collectors.toList());
        return cleaned;
    }
}
