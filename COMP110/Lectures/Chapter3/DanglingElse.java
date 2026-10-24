/**
 * COMP 110 - Chapter 3: Selections
 * Slides 20
 * Minimum Java version for this source: 8
 * Assumptions: Intentionally brace-free example to illustrate else binding.
 */
public class DanglingElse {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 3;
        if (i > j)
            if (i > k)
                System.out.println("A");
            else
                System.out.println("B");
        System.out.println("Finished");
    }
}
