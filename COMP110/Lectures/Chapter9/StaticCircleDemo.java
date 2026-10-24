/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 32
 */
public class StaticCircleDemo {
    public static void main(String[] args) {
        int before = Circle.getCreatedCount();
        Circle first = new Circle();
        Circle second = new Circle(2);
        System.out.println(Circle.getCreatedCount() - before);
        first.setRadius(4);
        System.out.println(first.getRadius());
        System.out.println(second.getRadius());
    }
}
