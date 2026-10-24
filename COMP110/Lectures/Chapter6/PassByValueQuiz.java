/**
 * COMP 110 - Chapter 6: Methods
 * Slides 21: Compare discarding a return value with assigning it.
 * Run: java PassByValueQuiz
 */
public class PassByValueQuiz {
    static int twice(int x) {
        return x * 2;
    }

    static void nPrintln(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        twice(n);
        System.out.println("1. " + n);

        n = 4; // Start question 2 with the original value again.
        n = twice(n);
        System.out.println("2. " + n);
        System.out.println("3. A void method cannot supply an int value.");
        // This would not compile:
        // int y = nPrintln("Hi", 2);
    }
}
