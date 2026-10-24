import java.util.Arrays;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 33
 */
public class ArrayCopyUtilitiesDemo {
    public static void main(String[] args) {
        int[] source = {2, 3, 1, 5};
        int[] target = new int[4];
        System.arraycopy(source, 1, target, 0, 2);
        int[] copy = Arrays.copyOf(source, source.length);
        System.out.println(Arrays.toString(target));
        System.out.println(Arrays.toString(copy));
    }
}
