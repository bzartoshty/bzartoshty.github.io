import java.util.Scanner;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 70, 71
 * Assumptions: Exactly one ASCII character in 0-9, A-F, or a-f; surrounding spaces are not trimmed.
 */
public class HexDigit2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one hex digit: ");
        String text = input.nextLine();
        if (text.length() != 1) {
            System.out.println("Enter exactly one char");
            return;
        }
        char ch = text.charAt(0);
        int value;
        if (ch >= '0' && ch <= '9') {
            value = ch - '0';
        } else if (ch >= 'A' && ch <= 'F') {
            value = ch - 'A' + 10;
        } else if (ch >= 'a' && ch <= 'f') {
            value = ch - 'a' + 10;
        } else {
            System.out.println("Invalid hex digit");
            return;
        }
        System.out.println("Value: " + value);
    }
}
