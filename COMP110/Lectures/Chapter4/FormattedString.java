import java.util.Locale;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 67
 */
public class FormattedString {
    public static void main(String[] args) {
        double amount = 12.5;
        String report = String.format(Locale.US,
            "Amount: $%.2f", amount);
        System.out.println(report);
        System.out.println(String.valueOf(42));
    }
}
