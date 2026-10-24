import java.util.Arrays;

/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 20
 * Assumptions: Rows are non-null. Each row total fits in long.
 */
public class RowTotalsDemo {
    static long[] rowTotals(int[][] matrix) {
        long[] totals = new long[matrix.length];
        for (int r = 0; r < matrix.length; r++) {
            for (int value : matrix[r]) {
                totals[r] += value;
            }
        }
        return totals;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5}};
        System.out.println(Arrays.toString(rowTotals(matrix)));
    }
}
