/**
 * COMP 110 - Chapter 3: Selections
 * Slides 46
 * Minimum Java version for this source: 8
 */
public class LogicalQuizCheck {
    public static void main(String[] args) {
        System.out.println(true || false);
         System.out.println(true ^ true);
         System.out.println(!(false && true));
         int age = 20;
         System.out.println(age >= 18 && age <= 25);
         int divisor = 0, number = 10;
         System.out.println(divisor != 0 && number / divisor > 2);
    }
}
