package access.base;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 66
 */
public class PeerDemo {
    public static void main(String[] args) {
        AccessBase value = new AccessBase();
        System.out.println(value.packageOnly);
        System.out.println(value.label);
        // value.secret; // private in AccessBase
    }
}
