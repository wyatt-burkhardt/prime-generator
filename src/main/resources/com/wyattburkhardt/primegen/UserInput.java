package main.resources.com.wyattburkhardt.primegen;

import java.util.regex.Pattern;

public class UserInput {
    public Integer minRange;
    public Integer maxRange;
    public boolean isRange;
    public boolean isNo;
    public String value;
    private Pattern rangePattern;

    private Pattern endProgram;
    private Pattern singleNumber;
    private Pattern ensureOnlyNumbers;

    public UserInput(String input) {
        rangePattern = Pattern.compile("^[0-9]*[.]{3}[0-9]+");
        endProgram = Pattern.compile("[Nn]");
        singleNumber = Pattern.compile("^[^-][0-9]*");
        ensureOnlyNumbers = Pattern.compile("^[0-9]*$");
        value = input;
        isRange = rangePatternCheck();
        isNo = endPatternCheck();
        parseValue();

    }

    private boolean rangePatternCheck() {
        if (rangePattern.matcher(value).find()){
            return true;
        } else if (singleNumberCheck()){
            return ensureOnlyNumbersCheck();
        } else {
            return false;
        }

    }

    private boolean singleNumberCheck() {
        return singleNumber.matcher(value).find();
    }

    private boolean ensureOnlyNumbersCheck() {
        return ensureOnlyNumbers.matcher(value).find();
    }
    private boolean endPatternCheck() {
        return endProgram.matcher(value).find();
    }

    private void parseValue() {
        if (isRange) {
            InputParser parser = new InputParser(value);
            if(parser.range.size() == 2) {
                minRange = parser.range.get(0);
                maxRange = parser.range.get(1);
            } else {
                maxRange = parser.range.get(0);
                minRange = 0;
            }
        }
    }
}
