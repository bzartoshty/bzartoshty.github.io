/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 17
 * Assumptions: values is non-null and nonempty.
 */
public class FirstMaximumDemo {
    static int firstMaximum(int[] values) {
        int best = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] > values[best]) best = i;
        }
        return best;
    }

    public static void main(String[] args) {
        int[] values = {8, 3, 8, 1};
        int index = firstMaximum(values);
        System.out.println(index);
        System.out.println(values[index]);
    }
}
