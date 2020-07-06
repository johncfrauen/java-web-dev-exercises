package exercises.ch2;

import java.util.Scanner;

public class ConsoleImpl implements Console {
    private final Scanner scanner;

    public ConsoleImpl(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public double inputNumber(String prompt, double min, double max){
        printToConsole(prompt);
        var input = scanner.nextDouble();
        while (true){
            if (input >= min && input <= max){
                return input;
            }
            printToConsole("Please enter a number between " + min + " and " + max);
            input = scanner.nextDouble();
        }
    }

    @Override
    public String inputString(String prompt){
        printToConsole(prompt);
        while (true){
            var input = scanner.next();
            if (input != null){
                return input;
            }
            printToConsole("Please enter a string");
        }
    }

    @Override
    public void printToConsole(String str){
        System.out.println(str);
    }
}
