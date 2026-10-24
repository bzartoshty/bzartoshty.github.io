/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 30
 */
public class DynamicBindingDemo {
    public static void main(String[] args) {
        new Person("Ada").printPerson();
        new Student("Bo").printPerson();
        new GraduateStudent("Cy").printPerson();
    }
}
