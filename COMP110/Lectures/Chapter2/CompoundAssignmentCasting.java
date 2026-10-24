/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 42
 */
public class CompoundAssignmentCasting {
    public static void main(String[] args) {
        int sum = 0;
        sum += 4.5;
        System.out.println(sum);
        sum += 4.5;
        System.out.println(sum);
        int explicit = 0;
        explicit = (int) (explicit + 4.5);
        System.out.println(explicit);
        // sum = sum + 4.5; // double cannot be assigned to int
    }
}
