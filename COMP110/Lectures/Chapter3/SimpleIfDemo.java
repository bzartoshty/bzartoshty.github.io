import java.util.Scanner;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 9, 10
 * Minimum Java version for this source: 8
 */
public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        if (number % 5 == 0) {
            System.out.println("Hi Five");
        }
        if (number % 2 == 0) {
            System.out.println("Hi Even");
        }
    }
}
