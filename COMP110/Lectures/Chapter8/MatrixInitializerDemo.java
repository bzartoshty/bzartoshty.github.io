import java.util.Arrays;

/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 7
 */
public class MatrixInitializerDemo {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println(Arrays.deepToString(matrix));
        matrix = new int[][]{{7, 8}, {9, 10}};
        System.out.println(matrix[1][0]);
    }
}
