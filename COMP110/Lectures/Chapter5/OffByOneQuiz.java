/**
 * COMP 110 - Chapter 5: Loops
 * Slides 28
 */
public class OffByOneQuiz {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 5; i++) count++;
        System.out.println(count);
        count = 0;
        for (int i = 0; i < 5; i++) count++;
        System.out.println(count);
        count = 0;
        for (int i = 0; i <= 5; i++) count++;
        System.out.println(count);
    }
}
