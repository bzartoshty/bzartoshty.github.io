import java.util.Random;
import java.util.Arrays;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 21
 * Assumptions: values and random are non-null.
 */
public class ShuffleDemo {
    static void shuffle(int[] values, Random random) {
        for (int i = values.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = values[i];
            values[i] = values[j];
            values[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] values = {0, 1, 2, 3, 4};
        shuffle(values, new Random(7));
        System.out.println(Arrays.toString(values));
    }
}
