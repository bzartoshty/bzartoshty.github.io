/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 20
 */
public class TestPassObject {
    static void change(int number, Circle circle) {
        number = 10;
        circle.setRadius(5);
    }

    public static void main(String[] args) {
        int number = 1;
        Circle circle = new Circle(2);
        change(number, circle);
        System.out.println(number);
        System.out.println(circle.getRadius());
    }
}
