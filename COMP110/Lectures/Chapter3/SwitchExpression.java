import java.util.Scanner;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 59
 * Minimum Java version for this source: 14
 */
public class SwitchExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = input.nextInt();
        String label = switch (day) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            default -> "Other";
        };
        System.out.println(label);
    }
}
