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
    private Pattern singleNumber = Pattern.compile("\\d+");
    private InputParser parser;

    public UserInput(String input) {
        value = input;
        isRange = rangePatternCheck();
        isNo = endPatternCheck();
        parseValue();
    }

    private boolean rangePatternCheck() {
        if (rangePattern.matcher(value).find()){
            return true;
        } else if (singleNumberCheck()){
            return true;
        } else {
            return false;
        }

    }

    private boolean singleNumberCheck() {
        return singleNumber.matcher(value).find();
    }
    private boolean endPatternCheck() {
        return endProgram.matcher(value).find();
    }

    private void parseValue() {
        if (isRange) {
            parser = new InputParser(value);
            if(parser.range.size() == 2) {
                minRange = parser.range.get(0);
                maxRange = parser.range.get(1);
            } else {
                maxRange = parser.range.get(0);
            }
        }
    }
}
