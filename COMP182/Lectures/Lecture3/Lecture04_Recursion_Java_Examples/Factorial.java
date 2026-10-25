/**
 * COMP 182 - Lecture 4 Recursion
 * Source method: slide 9 of the supplied lecture.
 * Input 0 through 20 inclusive; long result. Default n is 4.
 */
public class Factorial {
    static long factorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException();
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = args.length == 0 ? 4 : Integer.parseInt(args[0]);
        System.out.println(factorial(n));
    }
}
