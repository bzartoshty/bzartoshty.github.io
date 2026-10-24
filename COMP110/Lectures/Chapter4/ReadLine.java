import java.util.Scanner;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 54
 * Assumptions: One input line, possibly empty; edge spaces are preserved.
 */
public class ReadLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a full line: ");
        String text = input.nextLine();
        System.out.println("[" + text + "]");
        System.out.println("Length: " + text.length());
    }
}
