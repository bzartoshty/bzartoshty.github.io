/**
 * COMP 182 - Lecture 4 Recursion
 * Source method: slide 11 of the supplied lecture.
 * Non-null String; the helper receives i = s.length() - 1. Reverses UTF-16 char units.
 */
public class ReversePrint {
    static void writeBackward(String s, int i) {
        if (i < 0) return;
        System.out.print(s.charAt(i));
        writeBackward(s, i - 1);
    }

    public static void main(String[] args) {
        String s = args.length == 0 ? "CODE" : args[0];
        writeBackward(s, s.length() - 1);
        System.out.println();
    }
}
