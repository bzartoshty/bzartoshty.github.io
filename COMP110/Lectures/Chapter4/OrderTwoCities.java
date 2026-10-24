import java.util.Scanner;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 60
 * Assumptions: Two lines; ordering is case-sensitive Java String order, not locale collation.
 */
public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first city: ");
        String first = input.nextLine();
        System.out.print("Enter second city: ");
        String second = input.nextLine();
        if (first.compareTo(second) <= 0) {
            System.out.println(first);
            System.out.println(second);
        } else {
            System.out.println(second);
            System.out.println(first);
        }
    }
}
