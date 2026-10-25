/**
 * COMP 182 - Lecture 4 Recursion
 * Source method: slide 14 of the supplied lecture.
 * Exact case and spacing; non-null String. Helper uses inclusive valid indexes or an empty interval.
 */
public class Palindrome {
    static boolean isPalindrome(String s,
                                int left, int right) {
        if (left >= right) return true;
        return s.charAt(left) == s.charAt(right)
            && isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String s = args.length == 0 ? "madam" : args[0];
        System.out.println(isPalindrome(s, 0, s.length() - 1));
    }
}
