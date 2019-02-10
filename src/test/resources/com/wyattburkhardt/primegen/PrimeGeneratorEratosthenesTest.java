package resources.com.wyattburkhardt.primegen;

import main.resources.com.wyattburkhardt.primegen.PrimeGeneratorEratosthenes;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeGeneratorEratosthenesTest {

    @Test
    public void testStandardRange() {

        List<Integer> expected = new ArrayList<Integer>();[5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97];

        PrimeGeneratorEratosthenes generator = new PrimeGeneratorEratosthenes();
        assertEquals(generator.generate(5, 100), expected);

    }
}
