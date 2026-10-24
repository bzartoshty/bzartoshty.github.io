/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 34
 */
public class IntegerOverflow {
    public static void main(String[] args) {
        int largest = 2_147_483_647;
        int wrapped = largest + 1;
        long widenedTooLate = largest + 1;
        long safe = (long) largest + 1;
        System.out.println(wrapped);
        System.out.println(widenedTooLate);
        System.out.println(safe);
    }
}
