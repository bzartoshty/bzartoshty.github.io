/**
 * COMP 110 - Chapter 6: Methods
 * Slides 17-18: Trace a copied primitive value.
 * Run: java IncrementDemo
 */
public class IncrementDemo {
    static void increment(int value) {
        value++;
        System.out.println(value);
    }

    public static void main(String[] args) {
        int x = 1;
        increment(x);
        System.out.println(x);
    }
}
