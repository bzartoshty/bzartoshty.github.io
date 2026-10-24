import java.util.Arrays;

/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 33
 */
public class ShallowMatrixCopyDemo {
    public static void main(String[] args) {
        int[][] original = {{1, 2}, {3, 4}};
        int[][] copy = original.clone();
        copy[0][0] = 99;
        System.out.println(original == copy);
        System.out.println(original[0] == copy[0]);
        System.out.println(Arrays.deepToString(original));
    }
}
