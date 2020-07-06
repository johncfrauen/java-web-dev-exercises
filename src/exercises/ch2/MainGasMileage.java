package exercises.ch2;

import java.util.Scanner;

public class MainGasMileage {
    public static void main(String[] args) {
        var console = new ConsoleImpl(new Scanner(System.in));
        double numMiles = console.inputNumber(
                "Please enter the number of miles driven: ", 0, 1000);
        double numGallons = console.inputNumber(
                "Please enter the number of gallons used: ", 0, 100_000);
        System.out.println("Your mpg is " + (numMiles / numGallons));
    }
}
