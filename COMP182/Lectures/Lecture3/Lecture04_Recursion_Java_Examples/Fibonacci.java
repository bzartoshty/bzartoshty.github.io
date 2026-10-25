/**
 * COMP 182 - Lecture 4 Recursion
 * Source method: slide 13 of the supplied lecture.
 * Numeric range 0 through 92; naive recursion is impractical for large n. Use n <= 10 for traces.
 */
public class Fibonacci {
    static long fib(int n) {
        if (n < 0 || n > 92)
            throw new IllegalArgumentException();
        if (n < 2) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = args.length == 0 ? 10 : Integer.parseInt(args[0]);
        System.out.println(fib(n));
    }
}
