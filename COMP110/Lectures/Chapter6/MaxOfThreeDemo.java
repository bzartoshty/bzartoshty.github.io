/**
 * COMP 110 - Chapter 6: Methods
 * Slides 47 (notes): Complete the review practice using a two-argument max method.
 * Run: java MaxOfThreeDemo
 */
public class MaxOfThreeDemo {
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    static int maxOfThree(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static void main(String[] args) {
        System.out.println(maxOfThree(4, 9, 2));
        System.out.println(maxOfThree(5, 5, 5));
        System.out.println(maxOfThree(-8, -3, -5));
    }
}
