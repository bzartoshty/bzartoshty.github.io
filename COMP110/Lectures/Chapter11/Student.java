/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 28
 */
public class Student extends Person {
    public Student(String name) { super(name); }
    @Override public String getInfo() { return "Student"; }
    @Override public String toString() {
        return "Student:" + getName();
    }
}
