import java.util.Random;
import java.util.Arrays;

/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 18
 */
public class RandomMatrixDemo {
    public static void main(String[] args) {
        Random random = new Random(8);
        int[][] matrix = new int[2][3];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = random.nextInt(10);
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
