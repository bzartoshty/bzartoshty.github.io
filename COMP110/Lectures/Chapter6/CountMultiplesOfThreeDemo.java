/**
 * COMP 110 - Chapter 6: Methods
 * Slides 45-46: Solve the exit quiz and check inclusive bounds.
 * Run: java CountMultiplesOfThreeDemo
 * Assumptions: start <= end, end < Integer.MAX_VALUE, and the count fits in int.
 */
public class CountMultiplesOfThreeDemo {
    static int countMultiplesOfThree(int start,
                                      int end) {
        int count = 0;
        for (int n = start; n <= end; n++) {
            if (n % 3 == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countMultiplesOfThree(1, 10));
        System.out.println(countMultiplesOfThree(3, 3));
        System.out.println(countMultiplesOfThree(4, 4));
        System.out.println(countMultiplesOfThree(0, 0));
        System.out.println(countMultiplesOfThree(-6, -1));
    }
}
