import java.util.*;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 50
 * Assumptions: Int tokens ending in 0; preserves first-seen order of distinct nonzero values; input fits available memory.
 */
public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ints; 0 ends:");
        ArrayList<Integer> values = new ArrayList<>();
        int value = input.nextInt();
        while (value != 0) {
            if (!values.contains(value)) values.add(value);
            value = input.nextInt();
        }
        System.out.println(values);
    }
}
