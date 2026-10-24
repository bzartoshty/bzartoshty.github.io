/**
 * COMP 110 - Chapter 5: Loops
 * Slides 42
 */
public class TestBreak {
    public static void main(String[] args) {
        int number = 0, sum = 0;
        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100) break;
        }
        System.out.println("Number: " + number);
        System.out.println("Sum: " + sum);
    }
}
