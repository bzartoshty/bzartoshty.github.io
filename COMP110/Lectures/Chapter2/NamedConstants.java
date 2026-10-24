/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 14
 */
public class NamedConstants {
    public static void main(String[] args) {
        final double PI = 3.14159;
        final int MAX_STUDENTS = 30;
        double radius = 2;
        double area = PI * radius * radius;
        System.out.println(area);
        System.out.println(MAX_STUDENTS);
        // PI = 3.14; // cannot reassign this final variable
    }
}
