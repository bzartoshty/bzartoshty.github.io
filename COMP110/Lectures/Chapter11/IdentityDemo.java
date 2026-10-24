/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 39
 */
public class IdentityDemo {
    public static void main(String[] args) {
        Circle first = new Circle(2);
        Circle second = new Circle(2);
        Circle alias = first;
        System.out.println(first == second);
        System.out.println(first.equals(second));
        System.out.println(first == alias);
    }
}
