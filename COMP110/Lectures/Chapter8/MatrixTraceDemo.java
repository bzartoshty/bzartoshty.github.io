import java.util.Arrays;

/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 15
 */
public class MatrixTraceDemo {
    public static void main(String[] args) {
        int[][] matrix = new int[2][3];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = 10 * r + c;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
