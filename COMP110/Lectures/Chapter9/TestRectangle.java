/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 29
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        rectangle.setWidth(5);
        System.out.println(rectangle.getArea());
    }
}
