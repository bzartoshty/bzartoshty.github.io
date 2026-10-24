/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 22
 */
public class CovariantReturnDemo {
    static class Parent {
        public Number getNumber() { return 1; }
    }
    static class Child extends Parent {
        @Override public Integer getNumber() { return 2; }
    }

    public static void main(String[] args) {
        Parent value = new Child();
        System.out.println(value.getNumber());
    }
}
