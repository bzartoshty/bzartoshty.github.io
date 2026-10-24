import java.util.Locale;

/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 71
 * Assumptions: Non-null ASCII text. Count letters a-z case-insensitively.
 */
public class LetterCountsDemo {
    static int[] countLetters(String text) {
        int[] counts = new int[26];
        String lower = text.toLowerCase(Locale.ROOT);
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch >= 'a' && ch <= 'z') counts[ch - 'a']++;
        }
        return counts;
    }

    public static void main(String[] args) {
        int[] counts = countLetters("Java, JAVA!");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((char) ('a' + i) + ": " + counts[i]);
            }
        }
    }
}
