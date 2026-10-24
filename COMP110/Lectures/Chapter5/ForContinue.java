/**
 * COMP 110 - Chapter 5: Loops
 * Slides 44
 */
public class ForContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
