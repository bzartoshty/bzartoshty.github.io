/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 67
 */
public class VisibilityWidenDemo {
    static class Parent {
        protected String label() { return "Parent"; }
    }
    static class Child extends Parent {
        @Override public String label() { return "Child"; }
    }

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.label());
    }
}
