import java.awt.geom.Point2D;

/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 36
 */
public class PointObjectDemo {
    public static void main(String[] args) {
        Point2D point = new Point2D.Double(3, 4);
        System.out.println(point.getX());
        System.out.println(point.getY());
        System.out.println(point.distance(0, 0));
        point.setLocation(6, 8);
        System.out.println(point.distance(0, 0));
    }
}
