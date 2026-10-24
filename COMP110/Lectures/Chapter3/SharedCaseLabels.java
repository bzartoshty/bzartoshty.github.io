import java.util.Scanner;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 57
 * Minimum Java version for this source: 8
 * Assumptions: 0 = Sunday, 1 = Monday, through 6 = Saturday.
 */
public class SharedCaseLabels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter day 0-6: ");
        int day = input.nextInt();
        switch (day) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Weekday"); break;
            case 0: case 6:
                System.out.println("Weekend"); break;
            default:
                System.out.println("Invalid day");
        }
    }
}
