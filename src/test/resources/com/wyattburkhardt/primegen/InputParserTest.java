package resources.com.wyattburkhardt.primegen;

import main.resources.com.wyattburkhardt.primegen.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputParserTest {

    @Test
    public void parseStandardInput() {
        InputParser parser = new InputParser("5...10");
        assertEquals(parser.range.size(), 2);
        assertEquals(parser.range.get(0), 5);
        assertEquals(parser.range.get(1), 10);
    }

    @Test
    public void parseLargeInputs() {
        InputParser parser = new InputParser("1000000...3000000");
        assertEquals(parser.range.size(), 2);
        assertEquals(parser.range.get(0), 1000000);
        assertEquals(parser.range.get(1), 3000000);
    }

    @Test
    public void parseMaxValue() {
        InputParser parser = new InputParser("...150");
        assertEquals(parser.range.size(), 1);
        assertEquals(parser.range.get(0), 150);
    }

    @Test
    public void parseSingleValue() {
        InputParser parser = new InputParser("150");
        assertEquals(parser.range.size(), 1);
        assertEquals(parser.range.get(0), 150);
    }

    @Test
    public void parseInvertedRange() {
        InputParser parser = new InputParser("10...5");
        assertEquals(parser.range.size(), 2);
        assertEquals(parser.range.get(0), 5);
        assertEquals(parser.range.get(1), 10);
    }

    @Test
    public void parseFailingValue() {
        Assertions.assertThrows(NumberFormatException.class, () -> {
            InputParser parser = new InputParser("150 200");
        });
    }

    @Test
    public void parseLetters() {
        Assertions.assertThrows(NumberFormatException.class, () -> {
            InputParser parser = new InputParser("abcde");
        });
    }

    @Test
    public void parseShortenedData(){
        Assertions.assertThrows(NumberFormatException.class, () -> {
            InputParser parser = new InputParser("15..25");
        });
    }

    @Test
    public void parseSpecialCharacters() {
        Assertions.assertThrows(NumberFormatException.class, () -> {
            InputParser parser = new InputParser("%^@&*");
        });
    }

}
