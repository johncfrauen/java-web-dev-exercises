package exercises.ch2;

import java.util.Scanner;

public class HelloWorldImpl implements HelloWorld {
    private Scanner input;

    public HelloWorldImpl(Scanner input) {
        this.input = input;
    }

    public void greet(){
        System.out.println("Hello, what is your name:");
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }

}
