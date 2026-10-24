/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 16
 * Assumptions: values is nonempty and contains finite values with a finite total.
 */
public class ArraySummaryDemo {
    public static void main(String[] args) {
        double[] values = {10, 20, 30, 40};
        double total = 0;
        for (double value : values) {
            total += value;
        }
        double average = total / values.length;
        System.out.println(total);
        System.out.println(average);
    }
}
