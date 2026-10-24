/**
 * COMP 110 - Chapter 6: Methods
 * Slides 19: Show why swapping parameter copies does not swap caller variables.
 * Run: java SwapDemo
 */
public class SwapDemo {
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int first = 5, second = 10;
        swap(first, second);
        System.out.println(first + " " + second);
    }
}
