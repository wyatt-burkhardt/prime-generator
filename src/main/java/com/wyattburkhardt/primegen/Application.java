package main.java.com.wyattburkhardt.primegen;

import main.resources.com.wyattburkhardt.primegen.UserInput;
import main.resources.com.wyattburkhardt.primegen.UserInterface;

import java.util.List;


public class Application {
    public static void main(String[] args) {
        runProgramLoop();
    }

    private static void runProgramLoop() {
        UserInterface userInterface = new UserInterface();
        boolean run = true;
        while(run) {
            userInterface.printRequest();
            UserInput userInput = userInterface.getUserInput(System.in);
            if (userInput.isRange) {
                List<Integer> primes = userInterface.getPrimeNumbers(userInput);
                userInterface.printPrimeNumbers(primes);
            } else if (userInput.isNo) {
                userInterface.printGoodbye();
                run = false;
            } else {
                userInterface.printNotUnderstood();
            }
        }
    }
}
