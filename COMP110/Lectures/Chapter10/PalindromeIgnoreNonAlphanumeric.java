import java.util.Locale;
import java.util.Scanner;

/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 69, 70
 * Assumptions: Input is non-null ASCII text. Ignore case and ASCII characters outside a-z and 0-9. An empty cleaned value is a palindrome.
 */
public class PalindromeIgnoreNonAlphanumeric {
    static String normalize(String text) {
        String lower = text.toLowerCase(Locale.ROOT);
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if ((ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9')) cleaned.append(ch);
        }
        return cleaned.toString();
    }

    static boolean isPalindrome(String text) {
        String cleaned = normalize(text);
        String reversed = new StringBuilder(cleaned)
            .reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println(isPalindrome(text));
    }
}
