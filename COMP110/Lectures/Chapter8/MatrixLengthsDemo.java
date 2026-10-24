/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 8
 */
public class MatrixLengthsDemo {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(matrix[3][2]);
        // System.out.println(matrix[4].length); // Invalid row.
    }
}
