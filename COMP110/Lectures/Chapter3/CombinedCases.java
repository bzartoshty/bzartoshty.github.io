import java.util.Scanner;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 60
 * Minimum Java version for this source: 14
 * Assumptions: Day numbering: Sunday is 0 and Saturday is 6.
 */
public class CombinedCases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter day 0-6: ");
        int day = input.nextInt();
        String category = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 0, 6 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println(category);
    }
}
