package resources.com.wyattburkhardt.primegen;

import main.resources.com.wyattburkhardt.primegen.PrimeGeneratorEratosthenes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeGeneratorEratosthenesTest {
    private PrimeGeneratorEratosthenes generator = new PrimeGeneratorEratosthenes();


    @Test
    void testStandardRange() {
        List<Integer> fiveToHundredExpected = Arrays.asList(5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        assertEquals(fiveToHundredExpected, generator.generate(5, 100));
    }

    @Test
    void testReverseStandard() {
        List<Integer> emptyExpected = Collections.emptyList();
        assertEquals(emptyExpected, generator.generate(100, 5));
    }

    @Test
    void testNullForMin() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> generator.generate(-1, 100));
    }

    @Test
    void testProvidedRange() {
        List<Integer> expected = Arrays.asList(7901, 7907, 7919);
        assertEquals(expected, generator.generate(7900, 7920));
    }

    @Test
    void testPrintRange() {
        List<Integer> primes = Arrays.asList(7901, 7907, 7919);
        String expected = "The prime numbers within the selected range are:\n7901, 7907, 7919\n\n";
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        generator.printRange(primes);
        assertEquals(expected, outContent.toString());
    }
}
