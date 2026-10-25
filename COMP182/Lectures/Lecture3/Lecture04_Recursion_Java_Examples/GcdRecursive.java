/**
 * COMP 182 - Lecture 4 Recursion
 * Source method: slide 22 of the supplied lecture.
 * Any int pair; nonnegative long result. Defines gcd(0, 0) as 0.
 */
public class GcdRecursive {
    static long gcd(int m, int n) {
        return gcdPositive(Math.abs((long) m),
                           Math.abs((long) n));
    }

    static long gcdPositive(long a, long b) {
        if (b == 0) return a;
        return gcdPositive(b, a % b);
    }

    public static void main(String[] args) {
        int m = args.length == 0 ? 27 : Integer.parseInt(args[0]);
        int n = args.length < 2 ? 18 : Integer.parseInt(args[1]);
        System.out.println(gcd(m, n));
    }
}
