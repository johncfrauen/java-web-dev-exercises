package exercises.ch2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var helloWorld = new HelloWorldImpl(input);
        helloWorld.greet();
    }
}
