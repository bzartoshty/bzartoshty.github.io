/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 29
 */
public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(2 + 3 * 4);
        System.out.println((2 + 3) * 4);
        System.out.println(20 / 5 * 2);
        System.out.println(20 / (5 * 2));
        System.out.println("Sum = " + 2 + 3);
        System.out.println("Sum = " + (2 + 3));
    }
}
