/**
 * COMP 110 - Chapter 5: Loops
 * Slides 24
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        int count = 5;
        do {
            System.out.println("Body: " + count);
            count++;
        } while (count < 3);
        System.out.println("After: " + count);
    }
}
