/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 41, 42
 * Assumptions: All elements are non-null.
 */
public class CopyCircleArrayDemo {
    static Circle[] copyCircles(Circle[] source) {
        Circle[] copy = new Circle[source.length];
        for (int i = 0; i < source.length; i++) {
            copy[i] = new Circle(source[i].getRadius());
        }
        return copy;
    }

    public static void main(String[] args) {
        Circle[] original = {new Circle(2), new Circle(3)};
        Circle[] shallow = original.clone();
        shallow[0].setRadius(9);
        System.out.println(original[0].getRadius());
        Circle[] independent = copyCircles(original);
        independent[0].setRadius(4);
        System.out.println(original[0].getRadius());
        System.out.println(independent[0].getRadius());
    }
}
