package main.resources.com.wyattburkhardt.primegen;

import java.util.List;

interface PrimeNumberGenerator {
    List<Integer> generate(int startingValue, int endingValue);
    boolean isPrime(int value);
}
