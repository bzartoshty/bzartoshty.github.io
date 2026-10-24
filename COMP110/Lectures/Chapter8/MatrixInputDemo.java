import java.util.Scanner;
import java.util.Arrays;

/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 17
 * Assumptions: Input contains six valid int tokens.
 */
public class MatrixInputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[2][3];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
