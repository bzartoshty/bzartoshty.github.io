import java.util.Scanner;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 30
 * Minimum Java version for this source: 8
 * Assumptions: Reads an integer answer; generated operands are reordered so first >= second.
 */
public class SubtractionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = (int) (Math.random() * 10);
        int second = (int) (Math.random() * 10);
        if (first < second) {
            int temporary = first;
            first = second;
            second = temporary;
        }
        System.out.println("What is " + first + " - " + second + "?");
        int answer = input.nextInt();
        if (answer == first - second) {
            System.out.println("Correct");
        } else {
            System.out.println("Correct answer: " + (first - second));
        }
    }
}
