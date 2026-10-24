/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 24
 */
public class PrivateMethodsDemo {
    static class Parent {
        private String getInfo() { return "Parent"; }
        public void printPerson() { System.out.println(getInfo()); }
    }
    static class Child extends Parent {
        private String getInfo() { return "Child"; }
    }

    public static void main(String[] args) {
        new Parent().printPerson();
        new Child().printPerson();
    }
}
