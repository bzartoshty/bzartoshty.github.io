/**
 * COMP 110 - Chapter 6: Methods
 * Slides 13: Print a message with a void method.
 * Run: java NPrintlnDemo
 */
public class NPrintlnDemo {
    public static void nPrintln(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        nPrintln("Welcome to Java", 3);
        // Wrong argument order causes a compilation error:
        // nPrintln(3, "Welcome to Java");
    }
}
