/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 46
 */
public class ImmutablePointDemo {
    public static void main(String[] args) {
        ImmutablePoint point = new ImmutablePoint(3, 4);
        ImmutablePoint alias = point;
        point = new ImmutablePoint(6, 8);
        System.out.println(alias.getX() + "," + alias.getY());
        System.out.println(point.getX() + "," + point.getY());
    }
}
