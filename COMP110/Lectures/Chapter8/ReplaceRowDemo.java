import java.util.Arrays;

/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 31
 * Assumptions: The outer array contains a row slot at index 0.
 */
public class ReplaceRowDemo {
    static void replaceFirstRow(int[][] matrix) {
        matrix[0] = new int[]{7, 8, 9};
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        replaceFirstRow(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
