import java.util.Scanner;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 55
 * Assumptions: Age token appears on its own line; the full name is on the next line.
 */
public class ScannerLineTransition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age on its own line: ");
        int age = input.nextInt();
        input.nextLine(); // consume the rest of that line
        System.out.print("Enter full name: ");
        String name = input.nextLine();
        System.out.println(age + ": " + name);
    }
}
