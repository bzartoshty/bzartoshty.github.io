import java.util.Random;

/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 35
 */
public class RandomObjectDemo {
    public static void main(String[] args) {
        Random first = new Random(9);
        Random second = new Random(9);
        for (int i = 0; i < 3; i++) {
            int a = first.nextInt(10);
            int b = second.nextInt(10);
            System.out.println(a + " " + b);
        }
    }
}
