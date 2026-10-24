/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 20, 21
 */
public class MethodMatchingDemo {
    static class Parent {
        public String show(Object value) { return "Parent Object"; }
    }
    static class Child extends Parent {
        @Override public String show(Object value) {
        return "Child Object";
    }
        public String show(String value) { return "Child String"; }
    }

    public static void main(String[] args) {
        Parent ref = new Child();
        Child child = new Child();
        Object argument = "hi";
        System.out.println(ref.show("hi"));
        System.out.println(child.show("hi"));
        System.out.println(child.show(argument));
    }
}
