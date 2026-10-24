import java.util.Random;

/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 39, 40
 * Assumptions: The array and each Circle are non-null. The total is representable.
 */
public class TotalArea {
    static double totalArea(Circle[] circles) {
        double total = 0;
        for (Circle circle : circles) total += circle.getArea();
        return total;
    }

    public static void main(String[] args) {
        Random random = new Random(9);
        Circle[] circles = new Circle[5];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(1 + random.nextInt(5));
        }
        for (Circle circle : circles) {
            System.out.printf(java.util.Locale.US, "r=%.0f area=%.2f%n",
                circle.getRadius(), circle.getArea());
        }
        System.out.printf(java.util.Locale.US, "Total: %.2f%n",
            totalArea(circles));
    }
}
