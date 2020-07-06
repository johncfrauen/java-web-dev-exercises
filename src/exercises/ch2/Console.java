package exercises.ch2;

public interface Console {
    double inputNumber(String prompt, double min, double max);
    String inputString(String prompt);
    void printToConsole(String str);
}
