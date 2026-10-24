/**
 * COMP 110 - Chapter 5: Loops
 * Slides 8
 */
public class WhileQuiz {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        while (i <= 3) {
            sum += i;
            i++;
        }
        System.out.println(sum + " " + i);
    }
}
