package exercises.ch2;

import java.util.Scanner;

public class MainAlice {
    public static void main(String[] args) {
        String excerpt = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' " +
                "thought Alice " +
                "'without pictures or conversation?'";
        var console = new ConsoleImpl(new Scanner(System.in));
        var searchTerm = console.inputString("Please enter a search term: ");
        System.out.println(excerpt.toLowerCase().contains(searchTerm.toLowerCase()));
    }
}
