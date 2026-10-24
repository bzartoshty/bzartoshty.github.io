/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 41
 */
public class TypeCasting {
    public static void main(String[] args) {
        double widened = 3;
        int positive = (int) 3.9;
        int negative = (int) -3.9;
        double late = (double) (5 / 2);
        double early = (double) 5 / 2;
        System.out.println(widened);
        System.out.println(positive + " " + negative);
        System.out.println(late + " " + early);
        // int x = 5 / 2.0; // explicit narrowing is required
    }
}
