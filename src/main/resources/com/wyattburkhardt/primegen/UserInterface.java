package main.resources.com.wyattburkhardt.primegen;


import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private static final String INPUT_REQUEST = "Please enter a range of numbers (ex: 5...10) (enter \"n\" to quit)";
    private static final String MISUNDERSTOOD = "I'm sorry I don't understand";
    private static final String GOODBYE = "Goodbye!";
    public String scanInput;
    public Scanner scanner;
    private UserInput userInput;
    private PrimeGeneratorEratosthenes primeGenerator;

    public UserInterface() {
        scanner = new Scanner(System.in);
        primeGenerator = new PrimeGeneratorEratosthenes();
    }

    

    // Intended loop for continual execution of input
//    public void runInputLoop() {
//        boolean run = true;
//        while (run) {
//            printRequest();
//            scanInput = scanner.next();
//            userInput = new UserInput(scanInput);
//            if (userInput.isRange) {
//                // get actual prime number data
//                List<Integer> primes = primeGenerator.generate(userInput.minRange, userInput.maxRange);
//                primeGenerator.printRange(primes);
//            } else if (userInput.isNo) {
//                printGoodbye();
//                run = false;
//            } else {
//                printNotUnderstood();
//            }
//        }
//    }

    public void printRequest() {
        System.out.println(INPUT_REQUEST);
    }

    private void printNotUnderstood() {
        System.out.println(MISUNDERSTOOD);
    }

    private void printGoodbye() {
        System.out.println(GOODBYE);
    }
}
