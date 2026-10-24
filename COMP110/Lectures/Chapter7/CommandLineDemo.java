/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 56
 */
public class CommandLineDemo {
    public static void main(String[] args) {
        System.out.println("Count: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + ": " + args[i]);
        }
    }
}
