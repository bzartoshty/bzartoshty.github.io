import java.util.Locale;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 39
 */
public class PrintfBasics {
    public static void main(String[] args) {
        double amount = 12.345;
        System.out.printf(Locale.US, "Amount: $%.2f%n", amount);
        System.out.printf("Passed: %b%n", true);
        System.out.printf("Grade: %c%n", 'A');
        System.out.printf("Count: %d%n", 12);
        System.out.printf("Name: %s%n", "Ada");
        System.out.printf("Progress: 50%%%n");
    }
}
