/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 55
 */
public class AverageRepair {
    public static void main(String[] args) {
        int first = 4;
        int second = 5;
        double wrong = (first + second) / 2;
        double corrected = (first + second) / 2.0;
        System.out.println("Before repair: " + wrong);
        System.out.println("After repair: " + corrected);
    }
}
