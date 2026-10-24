package access.base;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 63
 */
public class AccessBase {
    private String secret = "secret";
    String packageOnly = "package";
    protected String label = "base";
    public String publicLabel = "public";
    public String readSecret() { return secret; }
}
