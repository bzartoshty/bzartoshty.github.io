/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 43
 */
public class ConversionsQuiz {
    public static void main(String[] args) {
        int x = 4; int y = x++;
         System.out.println(x + " " + y);
         int a = 4; int b = ++a;
         System.out.println(a + " " + b);
         System.out.println((int) -2.9);
         System.out.println((double) (7 / 2));
         int sum = 0; sum += 4.5; sum += 4.5;
         System.out.println(sum);
    }
}
