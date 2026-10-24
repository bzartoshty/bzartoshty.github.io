import java.util.Random;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 40, 41
 * Assumptions: letters contains only lowercase ASCII letters a through z.
 */
public class CountLettersInArray {
    static int[] countLetters(char[] letters) {
        int[] counts = new int[26];
        for (char letter : letters) {
            counts[letter - 'a']++;
        }
        return counts;
    }

    public static void main(String[] args) {
        Random random = new Random(7);
        char[] letters = new char[100];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) ('a' + random.nextInt(26));
        }
        int[] counts = countLetters(letters);
        for (int i = 0; i < counts.length; i++) {
            System.out.println((char) ('a' + i) + ": " + counts[i]);
        }
    }
}
