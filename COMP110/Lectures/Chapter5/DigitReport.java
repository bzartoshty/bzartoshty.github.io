import java.util.Scanner;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 61
 * Assumptions: ASCII digit policy, one input line capped at 1000000 UTF-16 code units.
 */
public class DigitReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ASCII text: ");
        String text = input.nextLine();
        if (text.length() > 1000000) {
            System.out.println("Input too long");
            return;
        }
        int count = 0, sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= '0' && ch <= '9') {
                count++;
                sum += ch - '0';
            }
        }
        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
    }
}
