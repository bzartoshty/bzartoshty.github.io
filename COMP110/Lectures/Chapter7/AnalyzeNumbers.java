import java.util.Scanner;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 19, 20
 * Assumptions: Five finite numeric inputs. average requires a non-null, nonempty array and finite total.
 */
public class AnalyzeNumbers {
    static double average(double[] values) {
        double total = 0;
        for (double value : values) total += value;
        return total / values.length;
    }

    static int countAbove(double[] values, double mean) {
        int count = 0;
        for (double value : values) {
            if (value > mean) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] values = new double[5];
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }
        double mean = average(values);
        System.out.println("Average: " + mean);
        System.out.println("Above: " + countAbove(values, mean));
    }
}
