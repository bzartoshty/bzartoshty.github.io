import java.util.Scanner;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 35
 * Assumptions: Classifies ASCII ranges; a one-char input outside those ranges is Other.
 */
public class AsciiCharacterTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one ASCII character: ");
        String text = input.nextLine();
        if (text.length() != 1) {
            System.out.println("Enter exactly one char");
            return;
        }
        char ch = text.charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("ASCII uppercase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("ASCII lowercase");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("ASCII digit");
        } else {
            System.out.println("Other");
        }
    }
}
