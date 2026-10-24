/**
 * COMP 110 - Chapter 5: Loops
 * Slides 7
 */
public class ZeroIterations {
    public static void main(String[] args) {
        int count = 5;
        while (count < 3) {
            System.out.println("Inside");
            count++;
        }
        System.out.println("After: " + count);
    }
}
