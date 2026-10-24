import java.util.Arrays;

/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 24
 * Assumptions: Rows are non-null. Empty input returns {-1, -1}.
 */
public class MaximumPositionDemo {
    static int[] maximumPosition(int[][] matrix) {
        int bestRow = -1, bestColumn = -1;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (bestRow == -1 ||
                    matrix[r][c] > matrix[bestRow][bestColumn]) {
                    bestRow = r;
                    bestColumn = c;
                }
            }
        }
        return new int[]{bestRow, bestColumn};
    }

    public static void main(String[] args) {
        int[][] matrix = {{8, 2, 8}, {3, 7}};
        System.out.println(Arrays.toString(maximumPosition(matrix)));
    }
}
