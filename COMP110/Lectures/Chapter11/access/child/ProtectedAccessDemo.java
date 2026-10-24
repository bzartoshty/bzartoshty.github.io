package access.child;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 65
 */
public class ProtectedAccessDemo {
    public static void main(String[] args) {
        AccessChild child = new AccessChild();
        System.out.println(child.expose());
        System.out.println(child.allowed(new AccessChild()));
        System.out.println(child.publicLabel);
        System.out.println(child.readSecret());
        // child.label; // this client is not a subclass of AccessBase
    }
}
