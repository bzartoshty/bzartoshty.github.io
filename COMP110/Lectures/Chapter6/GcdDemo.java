/**
 * COMP 110 - Chapter 6: Methods
 * Slides 22-23: Find the greatest common divisor using a reusable method.
 * Run: java GcdDemo
 * Assumptions: a and b are positive integers.
 */
public class GcdDemo {
    static int gcd(int a, int b) {
        int k = Math.min(a, b);
        while (k >= 2) {
            if (a % k == 0 && b % k == 0) {
                return k;
            }
            k--;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(gcd(18, 24));
        System.out.println(gcd(7, 13));
        System.out.println(gcd(8, 8));
        System.out.println(gcd(1, 9));
    }
}
