package main.java.com.wyattburkhardt.primegen;

import main.resources.com.wyattburkhardt.primegen.UserInterface;

public class Application {
    public static void main(String[] args) {
        UserInterface primeGenerator = new UserInterface();
        primeGenerator.runInputLoop();
    }
}
