/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 27
 * Assumptions: Name supplied by examples is non-null.
 */
public class Person {
    private final String name;
    public Person(String name) { this.name = name; }
    public String getName() { return name; }
    public String getInfo() { return "Person"; }
    public void printPerson() { System.out.println(getInfo()); }
    @Override public String toString() { return "Person:" + name; }
}
