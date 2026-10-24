/**
 * COMP 110 - Chapter 5: Loops
 * Slides 29
 */
public class EquivalentLoops {
    public static void main(String[] args) {
        int first = 0;
        for (int i = 1; i <= 3; i++) first += i;
        int second = 0;
        int j = 1;
        while (j <= 3) {
            second += j;
            j++;
        }
        System.out.println(first + " " + second);
    }
}
