import java.util.Scanner;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 41
 * Minimum Java version for this source: 8
 */
public class TestBooleanOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        boolean byTwo = number % 2 == 0;
        boolean byThree = number % 3 == 0;
        System.out.println("Both: " + (byTwo && byThree));
        System.out.println("Either: " + (byTwo || byThree));
        System.out.println("Exactly one: " + (byTwo ^ byThree));
    }
}
