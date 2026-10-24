import java.util.Scanner;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 51, 52
 * Minimum Java version for this source: 8
 * Assumptions: Toy fixed draw 37; two-digit guesses from 10-99; invalid guesses rejected.
 */
public class LotteryDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a two-digit guess: ");
        int guess = input.nextInt();
        if (guess < 10 || guess > 99) {
            System.out.println("Invalid guess");
            return;
        }
        int draw = 37;
        int d1 = draw / 10, d2 = draw % 10;
        int g1 = guess / 10, g2 = guess % 10;
        int prize;
        if (guess == draw) {
            prize = 10000;
        } else if (g1 == d2 && g2 == d1) {
            prize = 3000;
        } else if (g1 == d1 || g1 == d2 || g2 == d1 || g2 == d2) {
            prize = 1000;
        } else {
            prize = 0;
        }
        System.out.println("Points: " + prize);
    }
}
