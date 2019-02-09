package resources.com.wyattburkhardt.primegen;

import main.resources.com.wyattburkhardt.primegen.Hello;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {
    String message = "Hello, World test";
    Hello helloUtil = new Hello();

    @Test
    public void testPrintMessage() {
        assertEquals(message, helloUtil.printMessage());
    }
}
