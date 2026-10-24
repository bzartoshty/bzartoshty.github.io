/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 30
 */
public class FieldScopeDemo {
    private int value = 2;

    void show(int value) {
        int doubled = value * 2;
        System.out.println(value);
        System.out.println(this.value);
        System.out.println(doubled);
    }

    public static void main(String[] args) {
        FieldScopeDemo sample = new FieldScopeDemo();
        sample.show(9);
    }
}
