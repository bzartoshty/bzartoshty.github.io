/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 11, 12
 */
public class ConstructorOrderDemo {
    static class Person {
        Person() { System.out.println("Person"); }
    }
    static class Employee extends Person {
        Employee() { this("employee");
        System.out.println("Employee no-arg"); }
        Employee(String role) { super();
        System.out.println("Employee arg"); }
    }
    static class Faculty extends Employee {
        Faculty() { super(); System.out.println("Faculty"); }
    }

    public static void main(String[] args) {
        new Faculty();
    }
}
