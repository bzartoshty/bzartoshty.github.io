/**
 * COMP 110 - Chapter 6: Methods
 * Slides 12: Return a value on every normal path.
 * Run: java SignDemo
 */
public class SignDemo {
    public static int sign(int n) {
        if (n > 0) return 1;
        if (n == 0) return 0;
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(sign(5));
        System.out.println(sign(0));
        System.out.println(sign(-8));
    }
}
