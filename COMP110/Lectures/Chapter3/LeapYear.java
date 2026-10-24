import java.util.Scanner;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 48, 49
 * Minimum Java version for this source: 8
 * Assumptions: Positive int year under the Gregorian arithmetic rule; nonpositive values rejected.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive year: ");
        int year = input.nextInt();
        if (year <= 0) {
            System.out.println("Invalid year");
            return;
        }
        boolean leap = (year % 4 == 0 && year % 100 != 0)
            || year % 400 == 0;
        System.out.println("Leap year: " + leap);
    }
}
