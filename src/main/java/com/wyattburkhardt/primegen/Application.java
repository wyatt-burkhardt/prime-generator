package main.java.com.wyattburkhardt.primegen;

import main.resources.com.wyattburkhardt.primegen.UserInterface;


public class Application {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        userInterface.printRequest();

//     run via commented-out loop
//        primeGenerator.runInputLoop();
    }
}
