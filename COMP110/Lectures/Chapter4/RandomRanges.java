/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 10
 * Assumptions: Random output varies; digit 0-9, die 1-6, last value 50-99.
 */
public class RandomRanges {
    public static void main(String[] args) {
        double sample = Math.random();
        int digit = (int) (sample * 10);
        int die = 1 + (int) (Math.random() * 6);
        int value = 50 + (int) (Math.random() * 50);
        System.out.println("Sample: " + sample);
        System.out.println("Digit: " + digit);
        System.out.println("Die: " + die);
        System.out.println("50-99: " + value);
    }
}
