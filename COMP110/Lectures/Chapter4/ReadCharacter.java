import java.util.Scanner;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 56
 * Assumptions: Reads the first UTF-16 code unit of a nonempty line, not necessarily a whole Unicode code point.
 */
public class ReadCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String text = input.nextLine();
        if (text.isEmpty()) {
            System.out.println("Empty input");
        } else {
            char first = text.charAt(0);
            System.out.println("First char: " + first);
        }
    }
}
