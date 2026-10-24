/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 16
 */
public class ConstructorAvailabilityDemo {
    public static void main(String[] args) {
        AutomaticCircle automatic = new AutomaticCircle();
        RequiredRadius explicit = new RequiredRadius(2);
        System.out.println(automatic.getRadius());
        System.out.println(explicit.getRadius());
        // new RequiredRadius(); // No matching constructor.
    }
}
