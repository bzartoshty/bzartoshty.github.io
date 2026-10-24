import java.util.Scanner;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 58
 * Minimum Java version for this source: 14
 */
public class ArrowSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = input.nextInt();
        switch (day) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            default -> System.out.println("Other");
        }
    }
}
