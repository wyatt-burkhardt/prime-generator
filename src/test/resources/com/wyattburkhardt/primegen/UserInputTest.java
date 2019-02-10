package resources.com.wyattburkhardt.primegen;

import main.resources.com.wyattburkhardt.primegen.UserInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserInputTest {


    @Test
    public void testIsRange() {
        UserInput input = new UserInput("5...10");
        assertEquals(input.value, "5...10");
        assertEquals(input.isNo, false);
        assertEquals(input.isRange, true);
        assertEquals(input.minRange, 5);
        assertEquals(input.maxRange, 10);
    }

    @Test
    public void testIsUpToRange() {
        UserInput upToInput = new UserInput("...20");
        assertEquals(upToInput.value, "...20");
        assertEquals(upToInput.isNo, false);
        assertEquals(upToInput.isRange, true);
        assertEquals(upToInput.minRange, null);
        assertEquals(upToInput.maxRange, 20);
    }

    @Test
    public void testSingleValue() {
        UserInput singleInput = new UserInput("25");
        assertEquals(singleInput.isNo, false);
        assertEquals(singleInput.isRange, true);
        assertEquals(singleInput.minRange, null);
        assertEquals(singleInput.maxRange, 25);
    }
    @Test
    public void testEndProgram() {
        UserInput endInput = new UserInput("n");
        assertEquals(endInput.value, "n");
        assertEquals(endInput.isNo, true);
        assertEquals(endInput.isRange, false);
        assertEquals(endInput.minRange, null);
        assertEquals(endInput.maxRange, null);
    }
}
