package access.child;

import access.base.AccessBase;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 64
 */
public class AccessChild extends AccessBase {
    public String expose() { return label; }
    public String allowed(AccessChild other) { return other.label; }
    // Not legal here: return other.label if other is AccessBase.
    // packageOnly and secret are not accessible here.
}
