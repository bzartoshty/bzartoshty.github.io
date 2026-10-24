/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 42
 * Assumptions: The sum fits in int. Do not pass an explicit null array.
 */
public class VarargsDemo {
    static int sum(int... values) {
        int total = 0;
        for (int value : values) total += value;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(2, 4, 6));
        System.out.println(sum(new int[]{5, 7}));
    }
}
