/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 42
 */
public class EqualityDemo {
    public static void main(String[] args) {
        CircleValue first = new CircleValue(2);
        CircleValue second = new CircleValue(2);
        System.out.println(first == second);
        System.out.println(first.equals(second));
        System.out.println(first.hashCode() == second.hashCode());
        System.out.println(first.equals(null));
        System.out.println(new CircleValue(-0.0).equals(
        new CircleValue(0.0)));
    }
}
