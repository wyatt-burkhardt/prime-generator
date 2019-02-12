package resources.com.wyattburkhardt.primegen;

import main.resources.com.wyattburkhardt.primegen.UserInput;
import main.resources.com.wyattburkhardt.primegen.UserInterface;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserInterfaceTest {
    private UserInterface userInterface = new UserInterface();
    private List<Integer> primesAsList = Arrays.asList(5, 7, 11, 13, 17, 19, 23);

    @Test
    void testGetUserInput() {
        InputStream in = new ByteArrayInputStream("5...25".getBytes());
        assertNotNull(userInterface.getUserInput(in));
    }

    @Test
    void testPrintMisunderstood() {
        String expected = "I'm sorry I don't understand\n";
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        userInterface.printNotUnderstood();
        assertEquals(expected, outContent.toString());
    }

    @Test
    void testPrintGoodbye() {
        String expected = "Goodbye!\n";
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        userInterface.printGoodbye();
        assertEquals(expected, outContent.toString());
    }

    @Test
    void testPrintInputRequest() {
        String expected = "Please enter a range of numbers (ex: 5...10) (enter \"n\" to quit)\n";
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        userInterface.printRequest();
        assertEquals(expected, outContent.toString());
    }

    @Test
    void testGetPrimeNumbers() {
        UserInput input = new UserInput("5...25");
        assertEquals(primesAsList, userInterface.getPrimeNumbers(input));
    }

    @Test
    void testPrintPrimeNumbers() {
        String expected = "The prime numbers within the selected range are:\n5, 7, 11, 13, 17, 19, 23\n\n";
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        userInterface.printPrimeNumbers(primesAsList);
        assertEquals(expected, outContent.toString());

    }
}
