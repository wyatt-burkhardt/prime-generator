package main.resources.com.wyattburkhardt.primegen;

import java.util.ArrayList;
import java.util.List;

public class PrimeGeneratorEratosthenes implements PrimeNumberGenerator {
    private static boolean[] prime;

    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        prime = new boolean[endingValue+1];
        for(int i = 2; i <= endingValue; i++)
            prime[i] = true;

        for (int p = 2; p * p <= endingValue; p++) {
            if(prime[p]) {
                for (int i = p * p; i <= endingValue; i += p)
                    prime[i] = false;
            }
        }
        return getPrimesInRange(startingValue, endingValue);
    }

    @Override
    public boolean isPrime(int value) {
        return prime[value];
    }

    private List<Integer> getPrimesInRange(int startingValue, int endingValue) {
        List<Integer> primesInRange = new ArrayList<>();
        for (int i = startingValue; i <= endingValue; i++) {
            if (isPrime(i))
                primesInRange.add(i);
        }
        return primesInRange;
    }

    public void printRange(List<Integer> primes) {
        StringBuilder output = new StringBuilder("The prime numbers within the selected range are:\n");
        for (int i = 0; i < primes.size(); i++){
            output.append(primes.get(i).toString()).append(", ");
        }
        System.out.println(output.substring(0, output.length() - 2) + "\n");
    }
}
