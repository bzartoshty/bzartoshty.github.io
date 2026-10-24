/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 38
 */
public class PrefixPostfix {
    public static void main(String[] args) {
        int first = 5;
        int savedFirst = first++;
        System.out.println(first + " " + savedFirst);
        int second = 5;
        int savedSecond = ++second;
        System.out.println(second + " " + savedSecond);
    }
}
