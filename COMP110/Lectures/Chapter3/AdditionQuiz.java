import java.util.Scanner;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 28
 * Minimum Java version for this source: 8
 * Assumptions: Reads one integer answer; both random operands are 0-9.
 */
public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = (int) (Math.random() * 10);
        int second = (int) (Math.random() * 10);
        System.out.println("What is " + first + " + " + second + "?");
        int answer = input.nextInt();
        if (answer == first + second) {
            System.out.println("Correct");
        } else {
            System.out.println("Correct answer: " + (first + second));
        }
    }
}
