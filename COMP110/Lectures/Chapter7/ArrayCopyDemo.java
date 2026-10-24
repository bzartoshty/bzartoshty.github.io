import java.util.Arrays;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 32
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {
        int[] source = {2, 3, 1};
        int[] target = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            target[i] = source[i];
        }
        target[0] = 99;
        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(target));
    }
}
