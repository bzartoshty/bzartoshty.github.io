/**
 * COMP 110 - Chapter 3: Selections
 * Slides 40
 * Minimum Java version for this source: 8
 */
public class LogicalOperators {
    public static void main(String[] args) {
        int age = 24, weight = 140;
        System.out.println(!(age > 18));
        System.out.println(!(weight == 150));
        System.out.println((age > 18) && (weight >= 140));
        System.out.println((age > 14) || (weight >= 150));
        System.out.println((age > 34) ^ (weight > 140));
    }
}
