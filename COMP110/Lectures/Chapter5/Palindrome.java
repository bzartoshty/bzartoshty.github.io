import java.util.Scanner;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 50, 51
 * Assumptions: Exact case-sensitive ASCII text; spaces and punctuation count; no normalization. Empty text is a palindrome.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ASCII text: ");
        String text = input.nextLine();
        int left = 0, right = text.length() - 1;
        boolean palindrome = true;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Palindrome: " + palindrome);
    }
}
