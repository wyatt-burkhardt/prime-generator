package resources.com.wyattburkhardt.primegen;

import main.resources.com.wyattburkhardt.primegen.PrimeGeneratorEratosthenes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeGeneratorEratosthenesTest {
    PrimeGeneratorEratosthenes generator = new PrimeGeneratorEratosthenes();


    @Test
    public void testStandardRange() {
        List<Integer> fiveToHundredExpected = Arrays.asList(5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        assertEquals(fiveToHundredExpected, generator.generate(5, 100));
    }

    @Test
    public void testReverseStandard() {
        List<Integer> emptyExpected = Arrays.asList();
        assertEquals(emptyExpected, generator.generate(100, 5));
    }

    @Test
    public void testNullForMin() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            generator.generate(-1, 100);
        });
    }

    @Test
    public void testProvidedRange() {
        List<Integer> expected = Arrays.asList(7901, 7907, 7919);
        assertEquals(expected, generator.generate(7900, 7920));
    }
}
