package main.resources.com.wyattburkhardt.primegen;


import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private static final String INPUT_REQUEST = "Please enter a range of numbers (ex: 5...10) (enter \"n\" to quit)";
    private static final String MISUNDERSTOOD = "I'm sorry I don't understand";
    private static final String GOODBYE = "Goodbye!";
    private PrimeGeneratorEratosthenes primeGenerator;

    public UserInterface() {
        primeGenerator = new PrimeGeneratorEratosthenes();
    }


    public void printRequest() {
        System.out.println(INPUT_REQUEST);
    }

    public UserInput getUserInput(InputStream in) {
        Scanner scanner = new Scanner(in);
        String scanInput = scanner.next();
        return new UserInput(scanInput);
    }

    public List<Integer> getPrimeNumbers(UserInput input) {
        return primeGenerator.generate(input.minRange, input.maxRange);
    }

    public void printPrimeNumbers(List<Integer> primes) {
        primeGenerator.printRange(primes);
    }

    public void printNotUnderstood() {
        System.out.println(MISUNDERSTOOD);
    }

    public void printGoodbye() {
        System.out.println(GOODBYE);
    }
}
