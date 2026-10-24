import java.util.Scanner;

/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 51
 * Assumptions: Nonnegative whole cents within int range.
 */
public class MonetaryUnits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter nonnegative whole cents: ");
        int remaining = input.nextInt();
        int dollars = remaining / 100;
        remaining %= 100;
        int quarters = remaining / 25;
        remaining %= 25;
        int dimes = remaining / 10;
        remaining %= 10;
        int nickels = remaining / 5;
        int pennies = remaining % 5;
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}
