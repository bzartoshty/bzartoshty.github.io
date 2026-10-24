/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 38
 */
public class CircleArrayDemo {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        System.out.println(circles[0] == null);
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i + 1);
        }
        for (Circle circle : circles) {
            System.out.println(circle.getRadius());
        }
    }
}
