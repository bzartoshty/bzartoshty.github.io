import java.util.Random;
import java.util.Arrays;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 15
 */
public class RandomArrayDemo {
    public static void main(String[] args) {
        Random random = new Random(7);
        int[] values = new int[5];
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(values));
    }
}
