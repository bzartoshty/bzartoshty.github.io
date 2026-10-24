/**
 * COMP 110 - Chapter 5: Loops
 * Slides 43
 */
public class TestContinue {
    public static void main(String[] args) {
        int number = 0, sum = 0;
        while (number < 20) {
            number++;
            if (number == 10 || number == 11) continue;
            sum += number;
        }
        System.out.println("Number: " + number);
        System.out.println("Sum: " + sum);
    }
}
