package resources.com.wyattburkhardt.primegen;

import main.resources.com.wyattburkhardt.primegen.UserInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserInputTest {
    UserInput input = new UserInput("5...10");

    @Test
    public void testIsRange() {
        assertEquals(input.isRange, true);
    }

    @Test
    public void testIsUpToRange() {
        UserInput upToInput = new UserInput("...20");
        assertEquals(upToInput.isRange, true);
    }

    @Test
    public void testValue() {
        assertEquals(input.value, "5...10");
    }

    @Test
    public void testEndProgram() {
        UserInput endInput = new UserInput("n");
        assertEquals(endInput.isNo, true);
    }
}
