/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 39
 */
public class WrapperBasicsDemo {
    public static void main(String[] args) {
        Integer whole = Integer.valueOf("12");
        Double decimal = Double.valueOf("12.4");
        int primitive = Integer.parseInt("12");
        System.out.println(whole.intValue());
        System.out.println(decimal.doubleValue());
        System.out.println(primitive);
    }
}
