package resources.com.wyattburkhardt.primegen;

import main.resources.com.wyattburkhardt.primegen.UserInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserInputTest {


    @Test
    public void testIsRange() {
        UserInput input = new UserInput("5...10");
        assertEquals("5...10", input.value);
        assertFalse(input.isNo);
        assertTrue(input.isRange);
        assertEquals(5, input.minRange);
        assertEquals(10, input.maxRange);
    }

    @Test
    public void testIsUpToRange() {
        UserInput upToInput = new UserInput("...20");
        assertEquals("...20", upToInput.value);
        assertFalse(upToInput.isNo);
        assertTrue(upToInput.isRange);
        assertEquals(0, upToInput.minRange);
        assertEquals(20, upToInput.maxRange);
    }

    @Test
    public void testSingleValue() {
        UserInput singleInput = new UserInput("25");
        assertEquals("25", singleInput.value);
        assertFalse(singleInput.isNo);
        assertTrue(singleInput.isRange);
        assertEquals(0, singleInput.minRange);
        assertEquals(25, singleInput.maxRange);
    }
    @Test
    public void testEndProgram() {
        UserInput endInput = new UserInput("n");
        assertEquals("n", endInput.value);
        assertTrue(endInput.isNo);
        assertFalse(endInput.isRange);
        assertNull(endInput.minRange);
        assertNull(endInput.maxRange);
    }

    @Test
    public void testNegativeFirst() {
        UserInput negativeInput = new UserInput("-5...25");
        assertEquals("-5...25", negativeInput.value);
        assertFalse(negativeInput.isNo);
        assertFalse(negativeInput.isRange);
        assertNull(negativeInput.minRange);
        assertNull(negativeInput.maxRange);
    }

    @Test
    public void testNegativeSecond() {
        UserInput negativeInput = new UserInput("5...-25");
        assertEquals("5...-25", negativeInput.value);
        assertFalse(negativeInput.isNo);
        assertFalse(negativeInput.isRange);
        assertNull(negativeInput.minRange);
        assertNull(negativeInput.maxRange);
    }

    @Test
    public void testInvalidOption() {
        UserInput invalidInput = new UserInput("test");
        assertEquals("test", invalidInput.value);
        assertFalse(invalidInput.isNo);
        assertFalse(invalidInput.isRange);
        assertNull(invalidInput.minRange);
        assertNull(invalidInput.maxRange);
    }
}
