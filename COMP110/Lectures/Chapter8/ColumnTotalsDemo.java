import java.util.Arrays;

/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 21
 * Assumptions: matrix is rectangular with non-null rows. Column totals fit in long.
 */
public class ColumnTotalsDemo {
    static long[] columnTotals(int[][] matrix) {
        int columns = matrix.length == 0 ? 0 : matrix[0].length;
        long[] totals = new long[columns];
        for (int[] row : matrix) {
            for (int c = 0; c < columns; c++) {
                totals[c] += row[c];
            }
        }
        return totals;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.toString(columnTotals(matrix)));
    }
}
