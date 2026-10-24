import java.util.Scanner;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 53
 * Assumptions: At least three whitespace-separated tokens.
 */
public class ReadWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three words: ");
        String first = input.next();
        String second = input.next();
        String third = input.next();
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
