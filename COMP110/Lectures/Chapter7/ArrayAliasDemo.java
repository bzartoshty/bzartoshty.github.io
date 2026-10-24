import java.util.Arrays;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 31
 */
public class ArrayAliasDemo {
    public static void main(String[] args) {
        int[] first = {2, 3, 1};
        int[] second = first;
        second[0] = 99;
        System.out.println(Arrays.toString(first));
        System.out.println(first == second);
    }
}
