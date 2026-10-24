import java.util.Scanner;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 46
 * Assumptions: One integer guess; random target is 0-100 inclusive.
 */
public class GuessNumberOneTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = (int) (Math.random() * 101);
        System.out.println("Guess 0-100:");
        int guess = input.nextInt();
        if (guess < target) System.out.println("Too low");
        else if (guess > target) System.out.println("Too high");
        else System.out.println("Correct: " + target);
    }
}
