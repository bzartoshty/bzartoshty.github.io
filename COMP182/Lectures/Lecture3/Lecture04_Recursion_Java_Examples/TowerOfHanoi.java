/**
 * COMP 182 - Lecture 4 Recursion
 * Source method: slide 19 of the supplied lecture.
 * Nonnegative disk count, three distinct pegs. Output grows exponentially; use small n.
 */
public class TowerOfHanoi {
    static void hanoi(int n, char from,
                      char to, char spare) {
        if (n < 0) throw new IllegalArgumentException();
        if (n == 0) return;
        hanoi(n - 1, from, spare, to);
        System.out.println(from + " to " + to);
        hanoi(n - 1, spare, to, from);
    }

    public static void main(String[] args) {
        int n = args.length == 0 ? 3 : Integer.parseInt(args[0]);
        hanoi(n, 'A', 'B', 'C');
    }
}
