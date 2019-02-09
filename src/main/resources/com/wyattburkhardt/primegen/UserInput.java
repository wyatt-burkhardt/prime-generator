package main.resources.com.wyattburkhardt.primegen;

import java.util.regex.Pattern;

public class UserInput {
    public String value;
    public boolean isRange;
    public boolean isNo;
    private Pattern rangePattern = Pattern.compile("^(?:[0-9]{0,}[.]{3}[0-9]{1,})");
    private Pattern endProgram = Pattern.compile("[Nn]");

    public UserInput(String input) {
        value = input;
        isRange = rangePatternCheck();
        isNo = endPatternCheck();
    }

    private boolean rangePatternCheck() {
        return rangePattern.matcher(value).find();
    }

    private boolean endPatternCheck() {
        return endProgram.matcher(value).find();
    }
}
