import java.util.Arrays;

/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 32
 */
public class ReassignMatrixDemo {
    static void replaceMatrix(int[][] matrix) {
        matrix = new int[][]{{9, 9}};
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        replaceMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
