/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 12
 * Assumptions: matrix and every row are non-null.
 */
public class PrintMatrixDemo {
    static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5}};
        printMatrix(matrix);
    }
}
