import java.util.Scanner;
import java.util.Arrays;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 14
 * Assumptions: Input consists of three valid double tokens.
 */
public class ArrayInputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] values = new double[3];
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }
        System.out.println(Arrays.toString(values));
    }
}
