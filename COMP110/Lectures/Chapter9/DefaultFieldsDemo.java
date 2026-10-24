/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 18
 */
public class DefaultFieldsDemo {
    public static void main(String[] args) {
        DefaultFields item = new DefaultFields();
        System.out.println(item.count);
        System.out.println(item.active);
        System.out.println(item.name);
        Circle missing = null;
        System.out.println(missing == null);
        // missing.getArea(); // NullPointerException at run time.
    }
}
