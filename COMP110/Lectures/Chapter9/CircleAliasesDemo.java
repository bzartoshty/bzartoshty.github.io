/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 12
 * Assumptions: Compile with Circle.java.
 */
public class CircleAliasesDemo {
    public static void main(String[] args) {
        Circle first = new Circle(2);
        Circle second = new Circle(5);
        Circle alias = first;
        alias.setRadius(7);
        System.out.println(first.getRadius());
        System.out.println(second.getRadius());
        System.out.println(first == alias);
        System.out.println(first == second);
    }
}
