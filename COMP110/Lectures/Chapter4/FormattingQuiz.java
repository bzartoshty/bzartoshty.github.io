import java.util.Locale;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 44
 */
public class FormattingQuiz {
    public static void main(String[] args) {
        System.out.printf(Locale.US, "|%5d|%n", 42);
        System.out.printf(Locale.US, "|%-5d|%n", 42);
        System.out.printf(Locale.US, "%.2f%n", 3.5);
        System.out.printf(Locale.US, "%.3s%n", "Java");
    }
}
