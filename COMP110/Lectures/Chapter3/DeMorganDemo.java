/**
 * COMP 110 - Chapter 3: Selections
 * Slides 45
 * Minimum Java version for this source: 8
 */
public class DeMorganDemo {
    public static void main(String[] args) {
        int age = 24, weight = 140;
        boolean first = !(age > 18 && weight >= 140);
        boolean second = age <= 18 || weight < 140;
        boolean third = !(age > 18 || weight >= 140);
        boolean fourth = age <= 18 && weight < 140;
        System.out.println(first + " " + second);
        System.out.println(third + " " + fourth);
    }
}
