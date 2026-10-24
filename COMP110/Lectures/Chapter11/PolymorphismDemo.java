/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 31
 */
public class PolymorphismDemo {
    public static void show(Object value) {
        System.out.println(value.toString());
    }

    public static void main(String[] args) {
        show(new Person("Ada"));
        show(new Student("Bo"));
        show(new GraduateStudent("Cy"));
        show(new Circle(2));
    }
}
