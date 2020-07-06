package exercises.ch2;

import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        var console = new ConsoleImpl(new Scanner(System.in));
        var rectangle = new RectangleImpl(
                console.inputNumber("Enter the width: ", 0, 100_000),
                console.inputNumber("Enter the length: ", 0, 100_000));
        System.out.println("The area of your rectangle is " + rectangle.calculateArea());
    }
}
