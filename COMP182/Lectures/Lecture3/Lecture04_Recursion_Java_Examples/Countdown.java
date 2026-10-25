/**
 * COMP 182 - Lecture 4 Recursion
 * Source method: slide 8 of the supplied lecture.
 * Input n >= 1. Default n is 3. Very large inputs may exhaust the stack.
 */
public class Countdown {
    static void countdown(int n) {
        if (n < 1) throw new IllegalArgumentException();
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        countdown(n - 1);
    }

    public static void main(String[] args) {
        int n = args.length == 0 ? 3 : Integer.parseInt(args[0]);
        countdown(n);
    }
}
