package main.resources.com.wyattburkhardt.primegen;


import java.util.Scanner;

public class UserInterface {
    private static final String INPUT_REQUEST = "Please enter a range of numbers (ex: 5...10) (enter \"n\" to quit)";
    private static final String MISUNDERSTOOD = "I'm sorry I don't understand";
    private Scanner scanner;
    private UserInput userInput;
    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    public void runInputLoop() {
        boolean run = true;
        while (run) {
            printRequest();
            String scanInput = scanner.next();
            userInput = new UserInput(scanInput);
            if (userInput.isRange) {
                // get actual prime number data
                System.out.println("WOOOOOOOOOOOH");
            } else if (userInput.isNo) {
                run = false;
            } else {
                printNotUnderstood();
            }
        }
    }

    private void printRequest() {
        System.out.println(INPUT_REQUEST);
    }

    private void printNotUnderstood() {
        System.out.println(MISUNDERSTOOD);
    }
}
