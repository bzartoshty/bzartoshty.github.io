/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 19
 */
public class PrimitiveAndReferenceDemo {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        b = 9;
        Circle first = new Circle(3);
        Circle second = first;
        second.setRadius(9);
        System.out.println(a);
        System.out.println(first.getRadius());
    }
}
