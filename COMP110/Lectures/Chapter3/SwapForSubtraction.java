/**
 * COMP 110 - Chapter 3: Selections
 * Slides 29
 * Minimum Java version for this source: 8
 */
public class SwapForSubtraction {
    public static void main(String[] args) {
        int first = 2, second = 7;
        if (first < second) {
            int temporary = first;
            first = second;
            second = temporary;
        }
        System.out.println(first + " - " + second);
        System.out.println(first - second);
    }
}
