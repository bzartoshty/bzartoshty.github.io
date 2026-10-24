/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 34
 */
public class CompileTypeDemo {
    public static void main(String[] args) {
        Object value = new Circle(2);
        System.out.println(value.toString());
        // value.getRadius(); // not declared in Object
        Circle circle = (Circle) value;
        System.out.println(circle.getRadius());
    }
}
