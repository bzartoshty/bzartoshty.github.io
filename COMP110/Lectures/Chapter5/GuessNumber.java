import java.util.Scanner;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 47
 * Assumptions: Integer guesses are supplied until target is found; target 0-100 inclusive.
 */
public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = (int) (Math.random() * 101);
        int attempts = 0;
        int guess;
        do {
            System.out.println("Guess 0-100:");
            guess = input.nextInt();
            attempts++;
            if (guess < target) System.out.println("Too low");
            else if (guess > target) System.out.println("Too high");
        } while (guess != target);
        System.out.println("Correct: " + target);
        System.out.println("Attempts: " + attempts);
    }
}
