import java.util.Scanner;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 65
 * Assumptions: Splits at first ordinary space; text required on each side. Not a general human-name parser.
 */
public class SplitName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String text = input.nextLine();
        int space = text.indexOf(' ');
        if (space <= 0 || space == text.length() - 1) {
            System.out.println("Need text on both sides of a space");
        } else {
            String first = text.substring(0, space);
            String rest = text.substring(space + 1);
            System.out.println("First: " + first);
            System.out.println("Rest: " + rest);
        }
    }
}
