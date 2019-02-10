package main.resources.com.wyattburkhardt.primegen;

import java.util.regex.Pattern;

public class UserInput {
    public Integer minRange;
    public Integer maxRange;
    public boolean isRange;
    public boolean isNo;
    public String value;
    private Pattern rangePattern = Pattern.compile("^(?:[0-9]{0,}[.]{3}[0-9]{1,})");
    private Pattern endProgram = Pattern.compile("[Nn]");
    private InputParser parser;

    public UserInput(String input) {
        value = input;
        isRange = rangePatternCheck();
        isNo = endPatternCheck();
        parser = new InputParser(value);
        minRange = parser.range.get(0);
        maxRange = parser.range.get(1);
    }

    private boolean rangePatternCheck() {
        return rangePattern.matcher(value).find();
    }

    private boolean endPatternCheck() {
        return endProgram.matcher(value).find();
    }
}
