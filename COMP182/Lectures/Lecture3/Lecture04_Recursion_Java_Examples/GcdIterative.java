/**
 * COMP 182 - Lecture 4 Recursion
 * Source method: slide 21 of the supplied lecture.
 * Any int pair; nonnegative long result. Defines gcd(0, 0) as 0.
 */
public class GcdIterative {
    static long gcdIter(int m, int n) {
        long a = Math.abs((long) m);
        long b = Math.abs((long) n);
        while (b != 0) {
            long remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {
        int m = args.length == 0 ? 27 : Integer.parseInt(args[0]);
        int n = args.length < 2 ? 18 : Integer.parseInt(args[1]);
        System.out.println(gcdIter(m, n));
    }
}
