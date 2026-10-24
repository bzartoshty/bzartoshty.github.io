import java.util.Arrays;

/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 37
 * Assumptions: matrix is rectangular with non-null rows.
 */
public class TransposeMatrixDemo {
    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = rows == 0 ? 0 : matrix[0].length;
        int[][] result = new int[columns][rows];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                result[c][r] = matrix[r][c];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
}
