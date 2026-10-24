/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 23
 */
public class StaticHidingDemo {
    static class Parent {
        public static String kind() { return "Parent static"; }
        public String describe() { return "Parent instance"; }
    }
    static class Child extends Parent {
        public static String kind() { return "Child static"; }
        @Override public String describe() { return "Child instance"; }
    }

    public static void main(String[] args) {
        Parent ref = new Child();
        System.out.println(Parent.kind());
        System.out.println(Child.kind());
        System.out.println(ref.kind()); // deliberate reading exercise
        System.out.println(ref.describe());
    }
}
