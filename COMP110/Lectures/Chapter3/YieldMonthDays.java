import java.util.Scanner;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 61
 * Minimum Java version for this source: 14
 * Assumptions: Positive Gregorian-rule year, with month validated by default.
 */
public class YieldMonthDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year and month: ");
        int year = input.nextInt();
        int month = input.nextInt();
        if (year <= 0) {
            System.out.println("Invalid year");
            return;
        }
        boolean leap = (year % 4 == 0 && year % 100 != 0)
            || year % 400 == 0;
        String result = switch (month) {
            case 2 -> {
                if (leap) yield "29 days";
                else yield "28 days";
            }
            case 4, 6, 9, 11 -> "30 days";
            case 1, 3, 5, 7, 8, 10, 12 -> "31 days";
            default -> "Invalid month";
        };
        System.out.println(result);
    }
}
