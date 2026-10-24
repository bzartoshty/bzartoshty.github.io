import java.util.Scanner;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 48
 * Assumptions: Integer guesses supplied until a fixed random target 0-100 is found.
 */
public class GuessNumberUsingBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = (int) (Math.random() * 101);
        int attempts = 0;
        while (true) {
            System.out.println("Guess 0-100:");
            int guess = input.nextInt();
            attempts++;
            if (guess == target) break;
            System.out.println(guess < target ? "Too low" : "Too high");
        }
        System.out.println("Correct: " + target);
        System.out.println("Attempts: " + attempts);
    }
}
