import java.util.Scanner;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 74
 * Minimum Java version for this source: 8
 * Assumptions: Int tokens; accepts side range 1-1000000 so sums fit int; rejects degenerate triples.
 */
public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three side lengths: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a < 1 || b < 1 || c < 1
                || a > 1000000 || b > 1000000 || c > 1000000) {
            System.out.println("Invalid side range");
            return;
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Not a triangle");
        } else if (a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
