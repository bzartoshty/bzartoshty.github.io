/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 23
 * Assumptions: Rows are non-null. Compile with RowTotalsDemo.java. Each row total fits in long.
 */
public class LargestRowTotalDemo {
    static int largestRowTotal(int[][] matrix) {
        long[] totals = RowTotalsDemo.rowTotals(matrix);
        if (totals.length == 0) return -1;
        int best = 0;
        for (int r = 1; r < totals.length; r++) {
            if (totals[r] > totals[best]) best = r;
        }
        return best;
    }

    public static void main(String[] args) {
        int[][] matrix = {{-5, -1}, {-2, -3}, {-5}};
        System.out.println(largestRowTotal(matrix));
    }
}
